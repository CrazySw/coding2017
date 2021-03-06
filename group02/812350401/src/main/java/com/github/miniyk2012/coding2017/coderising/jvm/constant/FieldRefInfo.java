package com.github.miniyk2012.coding2017.coderising.jvm.constant;

import com.github.miniyk2012.coding2017.coderising.jvm.print.ConstantPoolPrinter;

public class FieldRefInfo extends ConstantInfo{
	private int type = ConstantInfo.FIELD_INFO;
	private int classInfoIndex;
	private int nameAndTypeIndex;
	
	public FieldRefInfo(ConstantPool pool) {
		super(pool);
	}
	public int getType() {
		return type;
	}
	
	public int getClassInfoIndex() {
		return classInfoIndex;
	}
	public void setClassInfoIndex(int classInfoIndex) {
		this.classInfoIndex = classInfoIndex;
	}
	public int getNameAndTypeIndex() {
		return nameAndTypeIndex;
	}
	public void setNameAndTypeIndex(int nameAndTypeIndex) {
		this.nameAndTypeIndex = nameAndTypeIndex;
	}
	
	public String toString(){
		
		NameAndTypeInfo  typeInfo = (NameAndTypeInfo)this.getConstantInfo(this.getNameAndTypeIndex());
		
		return getClassName() +" : "+  typeInfo.getName() + ":" + typeInfo.getTypeInfo() +"]";
	}
	
	public String getClassName(){
		ClassInfo classInfo = (ClassInfo) this.getConstantInfo(this.getClassInfoIndex());
		return classInfo.getClassName();
		
	}
	
	public String getFieldName(){
		NameAndTypeInfo  typeInfo = (NameAndTypeInfo)this.getConstantInfo(this.getNameAndTypeIndex());
		return typeInfo.getName();		
	}
	
	public String getFieldType(){
		NameAndTypeInfo  typeInfo = (NameAndTypeInfo)this.getConstantInfo(this.getNameAndTypeIndex());
		return typeInfo.getTypeInfo();	
	}

	@Override
	public void accept(ConstantPoolPrinter.Visitor visitor) {
		visitor.visitFieldRefInfo(this);
	}
}
