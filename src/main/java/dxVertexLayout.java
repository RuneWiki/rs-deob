import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dxVertexLayout")
public class dxVertexLayout extends class150 {

    @OriginalMember(owner = "client!dxVertexLayout", name = "f", descriptor = "Ljagdx/IDirect3DVertexDeclaration;")
    public IDirect3DVertexDeclaration field9405;

    @OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Lmba;[Led;)V")
    public dxVertexLayout(class70 arg0, class560[] arg1) {
        VertexElementCollection var3 = new VertexElementCollection(arg0.field938);
        int var4 = 0;
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = 0;
            class560 var7 = arg1[var5];
            for (int var8 = 0; var7.method2996(1) > var8; var8++) {
                class568 var9 = var7.method2998(var8, (byte) -46);
                int var10;
                byte var11;
                byte var12;
                if (class568.field7414 == var9) {
                    var12 = 2;
                    var10 = 0;
                    var11 = 0;
                } else if (class568.field7415 == var9) {
                    var11 = 3;
                    var12 = 2;
                    var10 = 0;
                } else if (class568.field7417 == var9) {
                    var10 = 0;
                    var11 = 10;
                    var12 = 4;
                } else if (class568.field7419 == var9) {
                    var12 = 0;
                    var10 = var4++;
                    var11 = 5;
                } else if (class568.field7420 == var9) {
                    var11 = 5;
                    var12 = 1;
                    var10 = var4++;
                } else if (class568.field7421 == var9) {
                    var10 = var4++;
                    var12 = 2;
                    var11 = 5;
                } else {
                    var10 = var4++;
                    var11 = 5;
                    var12 = 3;
                }
                var3.addElement(var5, var12, 0, var11, var10, var6);
                var6 += var9.field7418;
            }
        }
        var3.finish();
        this.field9405 = arg0.field958.method3706(var3, null);
    }
}
