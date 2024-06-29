import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dxVertexLayout")
public class dxVertexLayout extends class715 {

    @OriginalMember(owner = "client!dxVertexLayout", name = "e", descriptor = "Ljagdx/IDirect3DVertexDeclaration;")
    public IDirect3DVertexDeclaration field5028;

    @OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Lki;[Lqe;)V", line = 3)
    public dxVertexLayout(class735 arg0, class491[] arg1) {
        VertexElementCollection var3 = new VertexElementCollection(arg0.field10263);
        int var4 = 0;
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = 0;
            class491 var7 = arg1[var5];
            for (int var8 = 0; var8 < var7.method2872(false); var8++) {
                class652 var9 = var7.method2873(var8, 105);
                if (class652.field9189 == var9) {
                    var3.addElement(var5, 2, 0, 0, 0, var6);
                } else if (class652.field9191 == var9) {
                    var3.addElement(var5, 2, 0, 3, 0, var6);
                } else if (class652.field9192 == var9) {
                    var3.addElement(var5, 4, 0, 10, 0, var6);
                } else if (class652.field9193 == var9) {
                    var3.addElement(var5, 0, 0, 5, var4++, var6);
                } else if (class652.field9194 == var9) {
                    var3.addElement(var5, 1, 0, 5, var4++, var6);
                } else if (class652.field9195 == var9) {
                    var3.addElement(var5, 2, 0, 5, var4++, var6);
                } else if (class652.field9196 == var9) {
                    var3.addElement(var5, 3, 0, 5, var4++, var6);
                }
                var6 += var9.field9186;
            }
        }
        var3.finish();
        this.field5028 = arg0.field10253.method2964(var3, null);
    }
}
