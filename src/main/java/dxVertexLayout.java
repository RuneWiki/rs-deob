import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dxVertexLayout")
public class dxVertexLayout extends class677 {

    @OriginalMember(owner = "client!dxVertexLayout", name = "f", descriptor = "Ljagdx/IDirect3DVertexDeclaration;")
    public IDirect3DVertexDeclaration field4389;

    @OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Lvg;[Llf;)V", line = 3)
    public dxVertexLayout(class49 arg0, class215[] arg1) {
        VertexElementCollection var3 = new VertexElementCollection(arg0.field726);
        int var4 = 0;
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = 0;
            class215 var7 = arg1[var5];
            for (int var8 = 0; var8 < var7.method1401(1); var8++) {
                class657 var9 = var7.method1404(var8, -113);
                int var10;
                byte var11;
                byte var12;
                if (class657.field9245 == var9) {
                    var10 = 0;
                    var11 = 2;
                    var12 = 0;
                } else if (class657.field9252 == var9) {
                    var12 = 3;
                    var10 = 0;
                    var11 = 2;
                } else if (class657.field9253 == var9) {
                    var11 = 4;
                    var12 = 10;
                    var10 = 0;
                } else if (class657.field9254 == var9) {
                    var10 = var4++;
                    var12 = 5;
                    var11 = 0;
                } else if (class657.field9255 == var9) {
                    var11 = 1;
                    var12 = 5;
                    var10 = var4++;
                } else if (class657.field9256 == var9) {
                    var12 = 5;
                    var11 = 2;
                    var10 = var4++;
                } else {
                    var12 = 5;
                    var10 = var4++;
                    var11 = 3;
                }
                var3.addElement(var5, var11, 0, var12, var10, var6);
                var6 += var9.field9247;
            }
        }
        var3.finish();
        this.field4389 = arg0.field720.method2558(var3, null);
    }
}
