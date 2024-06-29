import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dxVertexLayout")
public class dxVertexLayout extends class567 {

    @OriginalMember(owner = "client!dxVertexLayout", name = "h", descriptor = "Ljagdx/IDirect3DVertexDeclaration;")
    public IDirect3DVertexDeclaration field3829;

    @OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Lnca;[Luq;)V", line = 3)
    public dxVertexLayout(class54 arg0, class314[] arg1) {
        VertexElementCollection var3 = new VertexElementCollection(arg0.field655);
        int var4 = 0;
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = 0;
            class314 var7 = arg1[var5];
            for (int var8 = 0; var7.method1943(0) > var8; var8++) {
                class176 var9 = var7.method1938((byte) 93, var8);
                int var10;
                byte var11;
                byte var12;
                if (class176.field2671 == var9) {
                    var11 = 0;
                    var12 = 2;
                    var10 = 0;
                } else if (class176.field2676 == var9) {
                    var10 = 0;
                    var11 = 3;
                    var12 = 2;
                } else if (class176.field2677 == var9) {
                    var11 = 10;
                    var12 = 4;
                    var10 = 0;
                } else if (class176.field2678 == var9) {
                    var12 = 0;
                    var11 = 5;
                    var10 = var4++;
                } else if (class176.field2679 == var9) {
                    var10 = var4++;
                    var12 = 1;
                    var11 = 5;
                } else if (class176.field2680 == var9) {
                    var11 = 5;
                    var10 = var4++;
                    var12 = 2;
                } else {
                    var10 = var4++;
                    var12 = 3;
                    var11 = 5;
                }
                var3.addElement(var5, var12, 0, var11, var10, var6);
                var6 += var9.field2667;
            }
        }
        var3.finish();
        this.field3829 = arg0.field676.method2400(var3, null);
    }
}
