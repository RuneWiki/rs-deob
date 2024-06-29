import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dxVertexLayout")
public class dxVertexLayout extends class633 {

    @OriginalMember(owner = "client!dxVertexLayout", name = "b", descriptor = "Ljagdx/IDirect3DVertexDeclaration;")
    public IDirect3DVertexDeclaration field4633;

    @OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Lto;[Lej;)V", line = 3)
    public dxVertexLayout(class8 arg0, class108[] arg1) {
        VertexElementCollection var3 = new VertexElementCollection(arg0.field151);
        int var4 = 0;
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = 0;
            class108 var7 = arg1[var5];
            for (int var8 = 0; var8 < var7.method1019((byte) 67); var8++) {
                class369 var9 = var7.method1022(-74, var8);
                byte var10;
                byte var11;
                int var12;
                if (class369.field5774 == var9) {
                    var11 = 2;
                    var12 = 0;
                    var10 = 0;
                } else if (class369.field5775 == var9) {
                    var10 = 3;
                    var11 = 2;
                    var12 = 0;
                } else if (class369.field5776 == var9) {
                    var12 = 0;
                    var10 = 10;
                    var11 = 4;
                } else if (class369.field5777 == var9) {
                    var10 = 5;
                    var11 = 0;
                    var12 = var4++;
                } else if (class369.field5778 == var9) {
                    var11 = 1;
                    var12 = var4++;
                    var10 = 5;
                } else if (class369.field5779 == var9) {
                    var11 = 2;
                    var10 = 5;
                    var12 = var4++;
                } else {
                    var11 = 3;
                    var10 = 5;
                    var12 = var4++;
                }
                var3.addElement(var5, var11, 0, var10, var12, var6);
                var6 += var9.field5768;
            }
        }
        var3.finish();
        this.field4633 = arg0.field131.method2829(var3, null);
    }
}
