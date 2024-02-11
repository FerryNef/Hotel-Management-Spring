package edu.miu.cs.cs544.service;

import edu.miu.cs.cs544.domain.Customer;
import edu.miu.cs.cs544.domain.User;
import edu.miu.cs.cs544.dto.request.CustomerDTO;
import edu.miu.cs.cs544.dto.request.UserDTO;
import edu.miu.cs.cs544.dto.response.CustomerResponseDTO;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-21T08:46:37-0600",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 21.0.1 (Oracle Corporation)"
)
public class CustomerMapperImpl implements CustomerMapper {

    @Override
    public Customer mapToEntity(CustomerResponseDTO customerDTO) {
        if ( customerDTO == null ) {
            return null;
        }

        Customer customer = new Customer();

        customer.setId( customerDTO.getId() );
        customer.setFirstName( customerDTO.getFirstName() );
        customer.setLastName( customerDTO.getLastName() );
        customer.setEmail( customerDTO.getEmail() );
        customer.setPhone_num( customerDTO.getPhone_num() );
        customer.setUser( mapToEntity( customerDTO.getUser() ) );
        customer.setPhysicalAddress( customerDTO.getPhysicalAddress() );
        customer.setBillingAddress( customerDTO.getBillingAddress() );
        customer.setAuditData( customerDTO.getAuditData() );

        return customer;
    }

    @Override
    public Customer mapToEntity(CustomerDTO customerDTO) {
        if ( customerDTO == null ) {
            return null;
        }

        Customer customer = new Customer();

        customer.setFirstName( customerDTO.getFirstName() );
        customer.setLastName( customerDTO.getLastName() );
        customer.setEmail( customerDTO.getEmail() );
        customer.setPhone_num( customerDTO.getPhone_num() );
        customer.setUser( mapToEntity( customerDTO.getUser() ) );
        customer.setPhysicalAddress( customerDTO.getPhysicalAddress() );
        customer.setBillingAddress( customerDTO.getBillingAddress() );

        return customer;
    }

    @Override
    public CustomerResponseDTO mapToDto(Customer customer) {
        if ( customer == null ) {
            return null;
        }

        CustomerResponseDTO customerResponseDTO = new CustomerResponseDTO();

        customerResponseDTO.setId( customer.getId() );
        customerResponseDTO.setFirstName( customer.getFirstName() );
        customerResponseDTO.setLastName( customer.getLastName() );
        customerResponseDTO.setEmail( customer.getEmail() );
        customerResponseDTO.setPhone_num( customer.getPhone_num() );
        customerResponseDTO.setUser( mapToDto( customer.getUser() ) );
        customerResponseDTO.setAuditData( customer.getAuditData() );
        customerResponseDTO.setPhysicalAddress( customer.getPhysicalAddress() );
        customerResponseDTO.setBillingAddress( customer.getBillingAddress() );

        return customerResponseDTO;
    }

    @Override
    public User mapToEntity(UserDTO userDTO) {
        if ( userDTO == null ) {
            return null;
        }

        User user = new User();

        user.setUserName( userDTO.getUserName() );
        user.setUserPass( userDTO.getUserPass() );
        user.setUserType( userDTO.getUserType() );

        return user;
    }

    @Override
    public UserDTO mapToDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setUserName( user.getUserName() );
        userDTO.setUserPass( user.getUserPass() );
        userDTO.setUserType( user.getUserType() );

        return userDTO;
    }
}
