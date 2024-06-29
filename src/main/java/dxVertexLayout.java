import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dxVertexLayout")
public class dxVertexLayout extends class262 {

    @OriginalMember(owner = "client!dxVertexLayout", name = "h", descriptor = "Ljagdx/IDirect3DVertexDeclaration;")
    public IDirect3DVertexDeclaration field10550;

    @OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Lsga;[Lim;)V")
    public dxVertexLayout(class608 arg0, class435[] arg1) {
        VertexElementCollection var3 = new VertexElementCollection(arg0.field8564);
        int var4 = 0;
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = 0;
            class435 var7 = arg1[var5];
            for (int var8 = 0; var7.method2611((byte) -91) > var8; var8++) {
                class382 var9 = var7.method2607(5000, var8);
                if (class382.field5466 == var9) {
                    var3.addElement(var5, 2, 0, 0, 0, var6);
                } else if (class382.field5473 == var9) {
                    var3.addElement(var5, 2, 0, 3, 0, var6);
                } else if (class382.field5475 == var9) {
                    var3.addElement(var5, 4, 0, 10, 0, var6);
                } else if (class382.field5476 == var9) {
                    var3.addElement(var5, 0, 0, 5, var4++, var6);
                } else if (class382.field5477 == var9) {
                    var3.addElement(var5, 1, 0, 5, var4++, var6);
                } else if (class382.field5478 == var9) {
                    var3.addElement(var5, 2, 0, 5, var4++, var6);
                } else if (class382.field5479 == var9) {
                    var3.addElement(var5, 3, 0, 5, var4++, var6);
                }
                var6 += var9.field5469;
            }
        }
        var3.finish();
        this.field10550 = arg0.field8555.method4185(var3, null);
    }
}
