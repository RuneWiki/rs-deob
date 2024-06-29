import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dxVertexLayout")
public class dxVertexLayout extends class693 {

    @OriginalMember(owner = "client!dxVertexLayout", name = "f", descriptor = "Ljagdx/IDirect3DVertexDeclaration;")
    public IDirect3DVertexDeclaration field4428;

    @OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Lhg;[Lrk;)V")
    public dxVertexLayout(class644 arg0, class30[] arg1) {
        VertexElementCollection var3 = new VertexElementCollection(arg0.field9270);
        int var4 = 0;
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = 0;
            class30 var7 = arg1[var5];
            for (int var8 = 0; var7.method503((byte) -95) > var8; var8++) {
                class14 var9 = var7.method502(126, var8);
                byte var10;
                byte var11;
                int var12;
                if (class14.field731 == var9) {
                    var10 = 0;
                    var11 = 2;
                    var12 = 0;
                } else if (class14.field732 == var9) {
                    var12 = 0;
                    var10 = 3;
                    var11 = 2;
                } else if (class14.field733 == var9) {
                    var10 = 10;
                    var11 = 4;
                    var12 = 0;
                } else if (class14.field734 == var9) {
                    var11 = 0;
                    var12 = var4++;
                    var10 = 5;
                } else if (class14.field735 == var9) {
                    var10 = 5;
                    var12 = var4++;
                    var11 = 1;
                } else if (class14.field736 == var9) {
                    var10 = 5;
                    var11 = 2;
                    var12 = var4++;
                } else {
                    var10 = 5;
                    var11 = 3;
                    var12 = var4++;
                }
                var3.addElement(var5, var11, 0, var10, var12, var6);
                var6 += var9.field725;
            }
        }
        var3.finish();
        this.field4428 = arg0.field9267.method2704(var3, null);
    }
}
