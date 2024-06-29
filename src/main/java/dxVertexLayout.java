import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dxVertexLayout")
public class dxVertexLayout extends class538 {

    @OriginalMember(owner = "client!dxVertexLayout", name = "g", descriptor = "Ljagdx/IDirect3DVertexDeclaration;")
    public IDirect3DVertexDeclaration field3754;

    @OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Lbv;[Lds;)V")
    public dxVertexLayout(class256 arg0, class14[] arg1) {
        VertexElementCollection var3 = new VertexElementCollection(arg0.field3544);
        int var4 = 0;
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = 0;
            class14 var7 = arg1[var5];
            for (int var8 = 0; var8 < var7.method172(-26506); var8++) {
                class94 var9 = var7.method174(var8, (byte) 105);
                byte var10;
                byte var11;
                int var12;
                if (class94.field1441 == var9) {
                    var10 = 0;
                    var11 = 2;
                    var12 = 0;
                } else if (class94.field1443 == var9) {
                    var12 = 0;
                    var11 = 2;
                    var10 = 3;
                } else if (class94.field1445 == var9) {
                    var12 = 0;
                    var10 = 10;
                    var11 = 4;
                } else if (class94.field1446 == var9) {
                    var10 = 5;
                    var12 = var4++;
                    var11 = 0;
                } else if (class94.field1447 == var9) {
                    var10 = 5;
                    var12 = var4++;
                    var11 = 1;
                } else if (class94.field1448 == var9) {
                    var10 = 5;
                    var11 = 2;
                    var12 = var4++;
                } else {
                    var12 = var4++;
                    var11 = 3;
                    var10 = 5;
                }
                var3.addElement(var5, var11, 0, var10, var12, var6);
                var6 += var9.field1438;
            }
        }
        var3.finish();
        this.field3754 = arg0.field3527.method2430(var3, null);
    }
}
