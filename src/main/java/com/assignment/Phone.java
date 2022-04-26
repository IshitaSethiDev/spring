package com.assignment;

public class Phone {
    private String mob;

    public Phone() {
    }

    public String getMob() {
        return mob;
    }

    public void setMob(String mob) {
        this.mob = mob;
    }

    public Phone(String mob) {
        this.mob = mob;

    }

    @Override
    public String toString() {
        return "Phone{" +
                "mob='" + mob + '\'' +
                '}';
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mob == null) ? 0 : mob.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Phone other = (Phone) obj;
		if (mob == null) {
			if (other.mob != null)
				return false;
		} else if (!mob.equals(other.mob))
			return false;
		return true;
	}
    
    
}
