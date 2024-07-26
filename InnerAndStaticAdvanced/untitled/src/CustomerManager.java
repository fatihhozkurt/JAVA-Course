public class CustomerManager {

    public void  add(Customer customer)
    {
        if (CustomerValidator.valid(customer))
        {
            System.out.println(customer.get_name() + " " + customer.get_surname() +  " eklendi");
        }
        else
        {
            System.out.println(customer.get_name() + " " + customer.get_surname() + " eklenemedi");
        }
    }

    public void delete(Customer customer)
    {
        if (CustomerValidator.valid(customer)) {
            System.out.println(customer.get_name() + " " + customer.get_surname() + " silindi");
        }
        else
        {
            System.out.println(customer.get_name() + " " + customer.get_surname() + " silinemedi");
        }
    }

    public void update(Customer customer)
    {
        if (CustomerValidator.valid(customer))
        {
            System.out.println(customer.get_name() + " " + customer.get_surname() +  " güncellendi");
        }
        else
        {
            System.out.println(customer.get_name() + " " + customer.get_surname() + " güncellenemedi");
        }
    }
}
