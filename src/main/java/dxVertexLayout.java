import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dxVertexLayout")
public class dxVertexLayout extends class502 {

    @OriginalMember(owner = "client!dxVertexLayout", name = "f", descriptor = "Ljagdx/IDirect3DVertexDeclaration;")
    public IDirect3DVertexDeclaration field3829;

    @OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Ltga;[Loc;)V", line = 3)
    public dxVertexLayout(class54 arg0, class192[] arg1) {
        VertexElementCollection var3 = new VertexElementCollection(arg0.field699);
        int var4 = 0;
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = 0;
            class192 var7 = arg1[var5];
            for (int var8 = 0; var8 < var7.method1131((byte) 84); var8++) {
                class133 var9 = var7.method1130(var8, (byte) -85);
                byte var10;
                int var11;
                byte var12;
                if (class133.field1606 == var9) {
                    var12 = 0;
                    var11 = 0;
                    var10 = 2;
                } else if (class133.field1611 == var9) {
                    var10 = 2;
                    var11 = 0;
                    var12 = 3;
                } else if (class133.field1617 == var9) {
                    var11 = 0;
                    var12 = 10;
                    var10 = 4;
                } else if (class133.field1618 == var9) {
                    var12 = 5;
                    var10 = 0;
                    var11 = var4++;
                } else if (class133.field1619 == var9) {
                    var12 = 5;
                    var11 = var4++;
                    var10 = 1;
                } else if (class133.field1620 == var9) {
                    var11 = var4++;
                    var10 = 2;
                    var12 = 5;
                } else {
                    var12 = 5;
                    var10 = 3;
                    var11 = var4++;
                }
                var3.addElement(var5, var10, 0, var12, var11, var6);
                var6 += var9.field1608;
            }
        }
        var3.finish();
        this.field3829 = arg0.field696.method2478(var3, null);
    }
}
