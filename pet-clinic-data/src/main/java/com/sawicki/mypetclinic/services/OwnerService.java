package com.sawicki.mypetclinic.services;

import com.sawicki.mypetclinic.model.Owner;

public interface OwnerService extends CrudService <Owner, Long> {

    Owner findByLastName(String lastName);
}
