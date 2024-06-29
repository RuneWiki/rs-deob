import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dxVertexLayout")
public class dxVertexLayout extends class81 {

    @OriginalMember(owner = "client!dxVertexLayout", name = "f", descriptor = "Ljagdx/IDirect3DVertexDeclaration;")
    public IDirect3DVertexDeclaration field3493;

    @OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Lgaa;[Leda;)V", line = 3)
    public dxVertexLayout(class302 arg0, class563[] arg1) {
        VertexElementCollection var3 = new VertexElementCollection(arg0.field3721);
        int var4 = 0;
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = 0;
            class563 var7 = arg1[var5];
            for (int var8 = 0; var8 < var7.method3091(-124); var8++) {
                class638 var9 = var7.method3090(var8, (byte) 96);
                int var10;
                byte var11;
                byte var12;
                if (class638.field8940 == var9) {
                    var12 = 2;
                    var11 = 0;
                    var10 = 0;
                } else if (class638.field8946 == var9) {
                    var10 = 0;
                    var11 = 3;
                    var12 = 2;
                } else if (class638.field8947 == var9) {
                    var10 = 0;
                    var11 = 10;
                    var12 = 4;
                } else if (class638.field8948 == var9) {
                    var12 = 0;
                    var10 = var4++;
                    var11 = 5;
                } else if (class638.field8949 == var9) {
                    var11 = 5;
                    var10 = var4++;
                    var12 = 1;
                } else if (class638.field8950 == var9) {
                    var11 = 5;
                    var12 = 2;
                    var10 = var4++;
                } else {
                    var11 = 5;
                    var12 = 3;
                    var10 = var4++;
                }
                var3.addElement(var5, var12, 0, var11, var10, var6);
                var6 += var9.field8938;
            }
        }
        var3.finish();
        this.field3493 = arg0.field3716.method2318(var3, null);
    }
}
