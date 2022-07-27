
public class InterfaceAssignmentStore {

}

interface BrittaniaFranchise
{
	void satifyRequirements();
}





interface Wrapper 
{
	void brittaniaWrapper();
	void sealProduct();
}

interface Biscuit 
{
	void makeBiscuit();
	void qualityTest();
}

interface LocalIngredients extends BrittaniaFranchise
{
	void useLocal();
}

interface ImportedIngredients extends BrittaniaFranchise
{
	void useImported();
}





interface OpenFactory extends Wrapper, Biscuit, BrittaniaFranchise
{
	void getContract();
}
