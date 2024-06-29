import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dxVertexLayout")
public class dxVertexLayout extends class102 {

    @OriginalMember(owner = "client!dxVertexLayout", name = "c", descriptor = "Ljagdx/IDirect3DVertexDeclaration;")
    public IDirect3DVertexDeclaration field3217;

    @OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Lhv;[Lug;)V")
    public dxVertexLayout(class188 arg0, class410[] arg1) {
        VertexElementCollection var3 = new VertexElementCollection(arg0.field2437);
        int var4 = 0;
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = 0;
            class410 var7 = arg1[var5];
            for (int var8 = 0; var7.method2442(-1) > var8; var8++) {
                class76 var9 = var7.method2444(var8, 0);
                int var10;
                byte var11;
                byte var12;
                if (class76.field1031 == var9) {
                    var11 = 2;
                    var12 = 0;
                    var10 = 0;
                } else if (class76.field1035 == var9) {
                    var10 = 0;
                    var11 = 2;
                    var12 = 3;
                } else if (class76.field1036 == var9) {
                    var10 = 0;
                    var12 = 10;
                    var11 = 4;
                } else if (class76.field1037 == var9) {
                    var11 = 0;
                    var12 = 5;
                    var10 = var4++;
                } else if (class76.field1038 == var9) {
                    var10 = var4++;
                    var11 = 1;
                    var12 = 5;
                } else if (class76.field1039 == var9) {
                    var10 = var4++;
                    var12 = 5;
                    var11 = 2;
                } else {
                    var12 = 5;
                    var10 = var4++;
                    var11 = 3;
                }
                var3.addElement(var5, var11, 0, var12, var10, var6);
                var6 += var9.field1032;
            }
        }
        var3.finish();
        this.field3217 = arg0.field2418.method2389(var3, null);
    }
}
