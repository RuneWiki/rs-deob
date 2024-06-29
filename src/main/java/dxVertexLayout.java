import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dxVertexLayout")
public class dxVertexLayout extends class532 {

    @OriginalMember(owner = "client!dxVertexLayout", name = "g", descriptor = "Ljagdx/IDirect3DVertexDeclaration;")
    public IDirect3DVertexDeclaration field3821;

    @OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Lwda;[Lwj;)V")
    public dxVertexLayout(class547 arg0, class334[] arg1) {
        VertexElementCollection var3 = new VertexElementCollection(arg0.field8181);
        int var4 = 0;
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = 0;
            class334 var7 = arg1[var5];
            for (int var8 = 0; var8 < var7.method2033(0); var8++) {
                class58 var9 = var7.method2038(var8, 61);
                byte var10;
                byte var11;
                int var12;
                if (class58.field719 == var9) {
                    var10 = 0;
                    var11 = 2;
                    var12 = 0;
                } else if (class58.field728 == var9) {
                    var11 = 2;
                    var10 = 3;
                    var12 = 0;
                } else if (class58.field729 == var9) {
                    var11 = 4;
                    var12 = 0;
                    var10 = 10;
                } else if (class58.field731 == var9) {
                    var11 = 0;
                    var10 = 5;
                    var12 = var4++;
                } else if (class58.field732 == var9) {
                    var11 = 1;
                    var12 = var4++;
                    var10 = 5;
                } else if (class58.field733 == var9) {
                    var12 = var4++;
                    var10 = 5;
                    var11 = 2;
                } else {
                    var10 = 5;
                    var11 = 3;
                    var12 = var4++;
                }
                var3.addElement(var5, var11, 0, var10, var12, var6);
                var6 += var9.field727;
            }
        }
        var3.finish();
        this.field3821 = arg0.field8175.method2423(var3, null);
    }
}
