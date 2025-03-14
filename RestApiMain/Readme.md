+----------------------------------------------------------+
|           Client (e.g., Web Browser, Postman)            |
|   (Sends a request for information, e.g., /trainees)     |
+----------------------------------------------------------+
                             v
+----------------------------------------------------------+
|       JavaTraineeController (Handles HTTP Request)       |
|    - @RestController or @Controller                      |
|    - Receives request from client (e.g., /trainees)      |
|    - Validates input (optional), processes request       |
|    - Calls the appropriate method in JavaTraineeService  |
+----------------------------------------------------------+
                             v
+----------------------------------------------------------+
|       JavaTraineeService (Service Layer Interface)       |
|    - Provides a contract for business logic              |
|    - Methods like getAllTrainees(), createTrainee() etc. |
|    - Acts as an intermediary between Controller & Impl   |
|    - Calls JavaTraineeServiceImpl for real business logic|
+----------------------------------------------------------+
                             v
+----------------------------------------------------------+
|    JavaTraineeServiceImpl (Service Layer Implementation) |
|    - Implements the logic defined in JavaTraineeService  |
|    - Calls JavaTraineeRepo to fetch data from DB         |
|    - Converts data from Entity to DTO (data transfer)    |
|    - Handles core business logic (e.g., adding trainees) |
|    - Example: Calls the save() method to persist entities|
+----------------------------------------------------------+
                             v
               (Fetch Data from Database)
                             v
+----------------------------------------------------------+
|       JavaTraineeRepo (Repository Layer)                 |
|    - Extends JpaRepository or CrudRepository             |
|    - Defines CRUD methods (e.g., findAll(), save())      |
|    - Interacts with the Database (via JPA/Hibernate)     |
|    - Executes SQL queries or custom queries              |
|    - Example: fetch all trainees or save a new trainee   |
+----------------------------------------------------------+
                             v
  (Returns Data or Confirmation to the Service Layer)
                             v
+----------------------------------------------------------+
|      JavaTraineeEntity (Database Entity/ORM Object)      |
|    - Annotated with @Entity                              |
|    - Maps to the database table                          |
|    - Holds raw data from DB (e.g., name, email)          |
|    - Used by the repository for DB interactions          |
+----------------------------------------------------------+
                             v
+------------------------------------------------------------+
|        JavaTraineeDTO (Data Transfer Object)               |
|    - Maps and transfers only necessary data to/from the UI |
|    - Holds non-persistent data (e.g., name, email)         |
|    - Helps decouple controller & service layers from DB    |
|    - Simple POJO with only fields required for the API     |
+------------------------------------------------------------+
                             v
    (Response Sent Back to the Client, e.g., List of DTOs)
                             v
+----------------------------------------------------------+
|            Client (Receives Response with Data)          |
|   - Data is presented to the user in a readable format   |
+----------------------------------------------------------+
