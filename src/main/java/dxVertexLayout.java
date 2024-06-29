import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dxVertexLayout")
public class dxVertexLayout extends class110 {

    @OriginalMember(owner = "client!dxVertexLayout", name = "g", descriptor = "Ljagdx/IDirect3DVertexDeclaration;")
    public IDirect3DVertexDeclaration field4759;

    @OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Luda;[Lrf;)V")
    public dxVertexLayout(class475 arg0, class92[] arg1) {
        VertexElementCollection var3 = new VertexElementCollection(arg0.field6669);
        int var4 = 0;
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = 0;
            class92 var7 = arg1[var5];
            for (int var8 = 0; var8 < var7.method726(-84); var8++) {
                class382 var9 = var7.method722(var8, 120);
                if (class382.field5542 == var9) {
                    var3.addElement(var5, 2, 0, 0, 0, var6);
                } else if (class382.field5546 == var9) {
                    var3.addElement(var5, 2, 0, 3, 0, var6);
                } else if (class382.field5550 == var9) {
                    var3.addElement(var5, 4, 0, 10, 0, var6);
                } else if (class382.field5551 == var9) {
                    var3.addElement(var5, 0, 0, 5, var4++, var6);
                } else if (class382.field5552 == var9) {
                    var3.addElement(var5, 1, 0, 5, var4++, var6);
                } else if (class382.field5553 == var9) {
                    var3.addElement(var5, 2, 0, 5, var4++, var6);
                } else if (class382.field5554 == var9) {
                    var3.addElement(var5, 3, 0, 5, var4++, var6);
                }
                var6 += var9.field5548;
            }
        }
        var3.finish();
        this.field4759 = arg0.field6676.method2958(var3, null);
    }
}
