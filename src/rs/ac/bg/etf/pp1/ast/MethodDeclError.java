// generated with ast extension for cup
// version 0.8
// 29/0/2020 16:43:10


package rs.ac.bg.etf.pp1.ast;

public class MethodDeclError extends MethodDecl {

    public MethodDeclError () {
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MethodDeclError(\n");

        buffer.append(tab);
        buffer.append(") [MethodDeclError]");
        return buffer.toString();
    }
}