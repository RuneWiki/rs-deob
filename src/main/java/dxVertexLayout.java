import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dxVertexLayout")
public class dxVertexLayout extends class607 {

    @OriginalMember(owner = "client!dxVertexLayout", name = "b", descriptor = "Ljagdx/IDirect3DVertexDeclaration;")
    public IDirect3DVertexDeclaration field3955;

    @OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Lkaa;[Lmm;)V", line = 3)
    public dxVertexLayout(class44 arg0, class253[] arg1) {
        VertexElementCollection var3 = new VertexElementCollection(arg0.field784);
        int var4 = 0;
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = 0;
            class253 var7 = arg1[var5];
            for (int var8 = 0; var7.method1547((byte) 24) > var8; var8++) {
                class397 var9 = var7.method1550(var8, (byte) 37);
                int var10;
                byte var11;
                byte var12;
                if (class397.field5604 == var9) {
                    var10 = 0;
                    var11 = 2;
                    var12 = 0;
                } else if (class397.field5611 == var9) {
                    var10 = 0;
                    var12 = 3;
                    var11 = 2;
                } else if (class397.field5612 == var9) {
                    var10 = 0;
                    var11 = 4;
                    var12 = 10;
                } else if (class397.field5613 == var9) {
                    var10 = var4++;
                    var12 = 5;
                    var11 = 0;
                } else if (class397.field5614 == var9) {
                    var11 = 1;
                    var12 = 5;
                    var10 = var4++;
                } else if (class397.field5615 == var9) {
                    var12 = 5;
                    var10 = var4++;
                    var11 = 2;
                } else {
                    var12 = 5;
                    var11 = 3;
                    var10 = var4++;
                }
                var3.addElement(var5, var11, 0, var12, var10, var6);
                var6 += var9.field5602;
            }
        }
        var3.finish();
        this.field3955 = arg0.field797.method2647(var3, null);
    }
}
