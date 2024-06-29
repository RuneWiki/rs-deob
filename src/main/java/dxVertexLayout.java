import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dxVertexLayout")
public class dxVertexLayout extends class573 {

    @OriginalMember(owner = "client!dxVertexLayout", name = "h", descriptor = "Ljagdx/IDirect3DVertexDeclaration;")
    public IDirect3DVertexDeclaration field9702;

    @OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Loe;[Lls;)V", line = 3)
    public dxVertexLayout(class13 arg0, class148[] arg1) {
        VertexElementCollection var3 = new VertexElementCollection(arg0.field166);
        int var4 = 0;
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = 0;
            class148 var7 = arg1[var5];
            for (int var8 = 0; var7.method1132(-121) > var8; var8++) {
                class324 var9 = var7.method1129(var8, 81);
                byte var10;
                int var11;
                byte var12;
                if (class324.field4509 == var9) {
                    var10 = 2;
                    var11 = 0;
                    var12 = 0;
                } else if (class324.field4510 == var9) {
                    var12 = 3;
                    var11 = 0;
                    var10 = 2;
                } else if (class324.field4512 == var9) {
                    var11 = 0;
                    var10 = 4;
                    var12 = 10;
                } else if (class324.field4513 == var9) {
                    var11 = var4++;
                    var12 = 5;
                    var10 = 0;
                } else if (class324.field4514 == var9) {
                    var11 = var4++;
                    var10 = 1;
                    var12 = 5;
                } else if (class324.field4515 == var9) {
                    var12 = 5;
                    var10 = 2;
                    var11 = var4++;
                } else {
                    var11 = var4++;
                    var10 = 3;
                    var12 = 5;
                }
                var3.addElement(var5, var10, 0, var12, var11, var6);
                var6 += var9.field4505;
            }
        }
        var3.finish();
        this.field9702 = arg0.field154.method3789(var3, null);
    }
}
