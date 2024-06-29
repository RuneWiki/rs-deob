import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dxVertexLayout")
public class dxVertexLayout extends class314 {

    @OriginalMember(owner = "client!dxVertexLayout", name = "l", descriptor = "Ljagdx/IDirect3DVertexDeclaration;")
    public IDirect3DVertexDeclaration field9621;

    @OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Lik;[Ldm;)V", line = 3)
    public dxVertexLayout(class107 arg0, class680[] arg1) {
        VertexElementCollection var3 = new VertexElementCollection(arg0.field1604);
        int var4 = 0;
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = 0;
            class680 var7 = arg1[var5];
            for (int var8 = 0; var8 < var7.method3817(15); var8++) {
                class455 var9 = var7.method3818(var8, 0);
                byte var10;
                int var11;
                byte var12;
                if (class455.field6559 == var9) {
                    var11 = 0;
                    var12 = 0;
                    var10 = 2;
                } else if (class455.field6566 == var9) {
                    var10 = 2;
                    var11 = 0;
                    var12 = 3;
                } else if (class455.field6567 == var9) {
                    var12 = 10;
                    var10 = 4;
                    var11 = 0;
                } else if (class455.field6568 == var9) {
                    var11 = var4++;
                    var10 = 0;
                    var12 = 5;
                } else if (class455.field6569 == var9) {
                    var10 = 1;
                    var11 = var4++;
                    var12 = 5;
                } else if (class455.field6570 == var9) {
                    var12 = 5;
                    var10 = 2;
                    var11 = var4++;
                } else {
                    var12 = 5;
                    var11 = var4++;
                    var10 = 3;
                }
                var3.addElement(var5, var10, 0, var12, var11, var6);
                var6 += var9.field6565;
            }
        }
        var3.finish();
        this.field9621 = arg0.field1600.method3773(var3, null);
    }
}
