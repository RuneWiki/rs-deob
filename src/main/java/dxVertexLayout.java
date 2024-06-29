import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dxVertexLayout")
public class dxVertexLayout extends class530 {

    @OriginalMember(owner = "client!dxVertexLayout", name = "g", descriptor = "Ljagdx/IDirect3DVertexDeclaration;")
    public IDirect3DVertexDeclaration field3745;

    @OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Lde;[Lwg;)V", line = 3)
    public dxVertexLayout(class15 arg0, class58[] arg1) {
        VertexElementCollection var3 = new VertexElementCollection(arg0.field174);
        int var4 = 0;
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = 0;
            class58 var7 = arg1[var5];
            for (int var8 = 0; var7.method468(256) > var8; var8++) {
                class109 var9 = var7.method470(var8, false);
                byte var10;
                int var11;
                byte var12;
                if (class109.field1807 == var9) {
                    var11 = 0;
                    var12 = 2;
                    var10 = 0;
                } else if (class109.field1813 == var9) {
                    var10 = 3;
                    var12 = 2;
                    var11 = 0;
                } else if (class109.field1817 == var9) {
                    var10 = 10;
                    var11 = 0;
                    var12 = 4;
                } else if (class109.field1818 == var9) {
                    var11 = var4++;
                    var12 = 0;
                    var10 = 5;
                } else if (class109.field1819 == var9) {
                    var10 = 5;
                    var12 = 1;
                    var11 = var4++;
                } else if (class109.field1820 == var9) {
                    var10 = 5;
                    var11 = var4++;
                    var12 = 2;
                } else {
                    var11 = var4++;
                    var12 = 3;
                    var10 = 5;
                }
                var3.addElement(var5, var12, 0, var10, var11, var6);
                var6 += var9.field1809;
            }
        }
        var3.finish();
        this.field3745 = arg0.field182.method2432(var3, null);
    }
}
