package ca.ghildas.Metier;

import java.io.Serializable;
import java.util.List;

import ca.ghildas.entity.Operation;

public class OperationPage implements Serializable {

private List<Operation>	operations;
private int currentPage;
private int nbreOperations;
private int totalOperations;
private int totalPages;
public List<Operation> getOperations() {
	return operations;
}
public void setOperations(List<Operation> operations) {
	this.operations = operations;
}
public int getCurrentPage() {
	return currentPage;
}
public void setCurrentPage(int currentPage) {
	this.currentPage = currentPage;
}
public int getNbreOperations() {
	return nbreOperations;
}
public void setNbreOperations(int nbreOperations) {
	this.nbreOperations = nbreOperations;
}
public int getTotalOperations() {
	return totalOperations;
}
public void setTotalOperations(int totalOperations) {
	this.totalOperations = totalOperations;
}
public int getTotalPages() {
	return totalPages;
}
public void setTotalPages(int totalPages) {
	this.totalPages = totalPages;
}

}
