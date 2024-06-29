import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dxVertexLayout")
public class dxVertexLayout extends class328 {

    @OriginalMember(owner = "client!dxVertexLayout", name = "d", descriptor = "Ljagdx/IDirect3DVertexDeclaration;")
    public IDirect3DVertexDeclaration field3720;

    @OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Lgb;[Lada;)V", line = 3)
    public dxVertexLayout(class197 arg0, class150[] arg1) {
        VertexElementCollection var3 = new VertexElementCollection(arg0.field2393);
        int var4 = 0;
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = 0;
            class150 var7 = arg1[var5];
            for (int var8 = 0; var7.method827(-21571) > var8; var8++) {
                class546 var9 = var7.method825(var8, 15);
                byte var10;
                int var11;
                byte var12;
                if (class546.field7810 == var9) {
                    var10 = 0;
                    var11 = 0;
                    var12 = 2;
                } else if (class546.field7813 == var9) {
                    var11 = 0;
                    var12 = 2;
                    var10 = 3;
                } else if (class546.field7815 == var9) {
                    var12 = 4;
                    var11 = 0;
                    var10 = 10;
                } else if (class546.field7816 == var9) {
                    var12 = 0;
                    var11 = var4++;
                    var10 = 5;
                } else if (class546.field7817 == var9) {
                    var11 = var4++;
                    var10 = 5;
                    var12 = 1;
                } else if (class546.field7818 == var9) {
                    var11 = var4++;
                    var12 = 2;
                    var10 = 5;
                } else {
                    var11 = var4++;
                    var12 = 3;
                    var10 = 5;
                }
                var3.addElement(var5, var12, 0, var10, var11, var6);
                var6 += var9.field7812;
            }
        }
        var3.finish();
        this.field3720 = arg0.field2376.method2431(var3, null);
    }
}
