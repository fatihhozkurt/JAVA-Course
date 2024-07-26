public class DatabaseHelper {

    public static class CRUD
    {
        public static void add()
        {
            System.out.println("Added");
        }

        public static void delete()
        {
            System.out.println("Deleted");
        }

        public static void update()
        {
            System.out.println("Update");
        }
    }

    public static class Connection
    {
        public static void startConnection()
        {
            System.out.println("Connection Started");
        }

        public static void endConnection()
        {
            System.out.println("Connection Ended");
        }
    }
}
