import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dxVertexLayout")
public class dxVertexLayout extends class579 {

    @OriginalMember(owner = "client!dxVertexLayout", name = "c", descriptor = "Ljagdx/IDirect3DVertexDeclaration;")
    public IDirect3DVertexDeclaration field8222;

    @OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Lkfa;[Lpj;)V", line = 3)
    public dxVertexLayout(class386 arg0, class40[] arg1) {
        VertexElementCollection var3 = new VertexElementCollection(arg0.field5537);
        int var4 = 0;
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = 0;
            class40 var7 = arg1[var5];
            for (int var8 = 0; var8 < var7.method219(-1); var8++) {
                class385 var9 = var7.method221(var8, -1321);
                if (class385.field5515 == var9) {
                    var3.addElement(var5, 2, 0, 0, 0, var6);
                } else if (class385.field5522 == var9) {
                    var3.addElement(var5, 2, 0, 3, 0, var6);
                } else if (class385.field5523 == var9) {
                    var3.addElement(var5, 4, 0, 10, 0, var6);
                } else if (class385.field5524 == var9) {
                    var3.addElement(var5, 0, 0, 5, var4++, var6);
                } else if (class385.field5526 == var9) {
                    var3.addElement(var5, 1, 0, 5, var4++, var6);
                } else if (class385.field5527 == var9) {
                    var3.addElement(var5, 2, 0, 5, var4++, var6);
                } else if (class385.field5528 == var9) {
                    var3.addElement(var5, 3, 0, 5, var4++, var6);
                }
                var6 += var9.field5516;
            }
        }
        var3.finish();
        this.field8222 = arg0.field5542.method4116(var3, null);
    }
}
