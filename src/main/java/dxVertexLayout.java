import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dxVertexLayout")
public class dxVertexLayout extends class520 {

    @OriginalMember(owner = "client!dxVertexLayout", name = "e", descriptor = "Ljagdx/IDirect3DVertexDeclaration;")
    public IDirect3DVertexDeclaration field4021;

    @OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Lega;[Lth;)V")
    public dxVertexLayout(class662 arg0, class553[] arg1) {
        VertexElementCollection var3 = new VertexElementCollection(arg0.field9293);
        int var4 = 0;
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = 0;
            class553 var7 = arg1[var5];
            for (int var8 = 0; var7.method3104(false) > var8; var8++) {
                class103 var9 = var7.method3100(var8, 0);
                int var10;
                byte var11;
                byte var12;
                if (class103.field1441 == var9) {
                    var10 = 0;
                    var12 = 2;
                    var11 = 0;
                } else if (class103.field1442 == var9) {
                    var10 = 0;
                    var11 = 3;
                    var12 = 2;
                } else if (class103.field1445 == var9) {
                    var10 = 0;
                    var12 = 4;
                    var11 = 10;
                } else if (class103.field1446 == var9) {
                    var10 = var4++;
                    var11 = 5;
                    var12 = 0;
                } else if (class103.field1447 == var9) {
                    var11 = 5;
                    var10 = var4++;
                    var12 = 1;
                } else if (class103.field1448 == var9) {
                    var11 = 5;
                    var10 = var4++;
                    var12 = 2;
                } else {
                    var11 = 5;
                    var12 = 3;
                    var10 = var4++;
                }
                var3.addElement(var5, var12, 0, var11, var10, var6);
                var6 += var9.field1444;
            }
        }
        var3.finish();
        this.field4021 = arg0.field9273.method2529(var3, null);
    }
}
