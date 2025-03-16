+-------------------------+                 +--------------------------+
| JavaTraineeController   |  --(calls)-->   | JavaTraineeService       |
|   (Handles HTTP Request)|                 |   (interface)            |
|    - Receives HTTP req. |                 |    - Defines service     |
|    - Calls service      |                 |      contract            |
+-------------------------+                 |    - Methods like        |
         |                                  |      getAllTrainees(),   |
         |                                  |      createTrainee()     |
         v                                  +--------------------------+
+---------------------------+                 |
| JavaTraineeServiceImpl    |  --(calls)-->   | Implements               
|  (Implements Service      |                 v
|    Interface Logic)       |            +----------------------------+
|  - Provides business logic|           | JavaTraineeRepo            |
|  - Calls repo for DB      |           |   (interface)              |
|  - Converts Entities to   |           |  - Defines CRUD methods    |
|    DTOs                   |           |    like findAll(), save()  |
+---------------------------+           |  - Interacts with the DB   |
         |                              +----------------------------+
         |                                     |
         | Converts                            | Uses (interacts with DB)
         v                                     v
+-------------------------+                  +------------------------+
| JavaTraineeDTO          |                  | JavaTraineeEntity      |
|  (Data Transfer Object) |                  |  (Database Entity)     |
|  - Holds simplified data|                  |  - Maps to DB Table    |
|    for response         |                  |  - Fields: id, name,   |
|  - Represents API output|                  |    email, etc.         |
+-------------------------+                  +------------------------+
