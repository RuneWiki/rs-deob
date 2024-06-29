import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dxVertexLayout")
public class dxVertexLayout extends class116 {

    @OriginalMember(owner = "client!dxVertexLayout", name = "i", descriptor = "Ljagdx/IDirect3DVertexDeclaration;")
    public IDirect3DVertexDeclaration field3490;

    @OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Lhg;[Ljp;)V", line = 3)
    public dxVertexLayout(class591 arg0, class297[] arg1) {
        VertexElementCollection var3 = new VertexElementCollection(arg0.field8584);
        int var4 = 0;
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = 0;
            class297 var7 = arg1[var5];
            for (int var8 = 0; var8 < var7.method1654(15); var8++) {
                class44 var9 = var7.method1653(var8, 1023);
                byte var10;
                int var11;
                byte var12;
                if (class44.field361 == var9) {
                    var12 = 2;
                    var10 = 0;
                    var11 = 0;
                } else if (class44.field364 == var9) {
                    var10 = 3;
                    var11 = 0;
                    var12 = 2;
                } else if (class44.field365 == var9) {
                    var10 = 10;
                    var12 = 4;
                    var11 = 0;
                } else if (class44.field366 == var9) {
                    var11 = var4++;
                    var12 = 0;
                    var10 = 5;
                } else if (class44.field367 == var9) {
                    var10 = 5;
                    var11 = var4++;
                    var12 = 1;
                } else if (class44.field368 == var9) {
                    var12 = 2;
                    var10 = 5;
                    var11 = var4++;
                } else {
                    var11 = var4++;
                    var10 = 5;
                    var12 = 3;
                }
                var3.addElement(var5, var12, 0, var10, var11, var6);
                var6 += var9.field355;
            }
        }
        var3.finish();
        this.field3490 = arg0.field8586.method2333(var3, null);
    }
}
