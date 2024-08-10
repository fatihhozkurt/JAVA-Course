public class CustomerManager {

        public void add(Customer customer)
        {
            if (CustomerValidator.valid(customer)) {
                System.out.println(customer.get_name() + " added.");
            }
            else {
                System.out.println("eklenemedi");
            }

        }

    public void delete(Customer customer)
    {
        if (CustomerValidator.valid(customer)) {
            System.out.println(customer.get_name() + " deleted.");
        }
        else {
            System.out.println("eklenemedi");
        }

    }

    public void update(Customer customer)
    {
        if (CustomerValidator.valid(customer)) {
            System.out.println(customer.get_name() + " updated.");
        }
        else {
            System.out.println("eklenemedi");
        }

    }
    }