import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dxVertexLayout")
public class dxVertexLayout extends class501 {

    @OriginalMember(owner = "client!dxVertexLayout", name = "f", descriptor = "Ljagdx/IDirect3DVertexDeclaration;")
    public IDirect3DVertexDeclaration field4184;

    @OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Lss;[Lca;)V", line = 3)
    public dxVertexLayout(class401 arg0, class282[] arg1) {
        VertexElementCollection var3 = new VertexElementCollection(arg0.field5340);
        int var4 = 0;
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = 0;
            class282 var7 = arg1[var5];
            for (int var8 = 0; var8 < var7.method1752(1); var8++) {
                class512 var9 = var7.method1755(62, var8);
                int var10;
                byte var11;
                byte var12;
                if (class512.field6843 == var9) {
                    var12 = 0;
                    var11 = 2;
                    var10 = 0;
                } else if (class512.field6845 == var9) {
                    var10 = 0;
                    var11 = 2;
                    var12 = 3;
                } else if (class512.field6846 == var9) {
                    var12 = 10;
                    var10 = 0;
                    var11 = 4;
                } else if (class512.field6847 == var9) {
                    var11 = 0;
                    var10 = var4++;
                    var12 = 5;
                } else if (class512.field6848 == var9) {
                    var10 = var4++;
                    var12 = 5;
                    var11 = 1;
                } else if (class512.field6849 == var9) {
                    var12 = 5;
                    var11 = 2;
                    var10 = var4++;
                } else {
                    var11 = 3;
                    var12 = 5;
                    var10 = var4++;
                }
                var3.addElement(var5, var11, 0, var12, var10, var6);
                var6 += var9.field6844;
            }
        }
        var3.finish();
        this.field4184 = arg0.field5342.method2576(var3, null);
    }
}
