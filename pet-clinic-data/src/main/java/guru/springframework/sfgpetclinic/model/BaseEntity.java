package guru.springframework.sfgpetclinic.model;

import java.io.Serializable;
// just to handle id in all classes

public class BaseEntity implements Serializable {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
