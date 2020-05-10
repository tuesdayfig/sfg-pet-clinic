package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Person;

import java.util.Set;

public interface OwnerService<O extends Person, L extends Number> extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
