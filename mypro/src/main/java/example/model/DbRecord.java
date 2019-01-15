package example.model;

/** DbRecord is model which is used to represent data over browser or any other application
 *  For now we have one integer type data member "value"   */
public class DbRecord {
private int value=0;

public DbRecord(int value) {
	this.value=value;
}
public int getValue() {
	return value;
}

public void setValue(int value) {
	this.value = value;
}

}
