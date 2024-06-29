import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dxVertexLayout")
public class dxVertexLayout extends class542 {

    @OriginalMember(owner = "client!dxVertexLayout", name = "i", descriptor = "Ljagdx/IDirect3DVertexDeclaration;")
    public IDirect3DVertexDeclaration field4446;

    @OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Ltg;[Lsj;)V")
    public dxVertexLayout(class229 arg0, class459[] arg1) {
        VertexElementCollection var3 = new VertexElementCollection(arg0.field3092);
        int var4 = 0;
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = 0;
            class459 var7 = arg1[var5];
            for (int var8 = 0; var8 < var7.method2727((byte) 43); var8++) {
                class295 var9 = var7.method2726(93, var8);
                if (class295.field4149 == var9) {
                    var3.addElement(var5, 2, 0, 0, 0, var6);
                } else if (class295.field4155 == var9) {
                    var3.addElement(var5, 2, 0, 3, 0, var6);
                } else if (class295.field4156 == var9) {
                    var3.addElement(var5, 4, 0, 10, 0, var6);
                } else if (class295.field4157 == var9) {
                    var3.addElement(var5, 0, 0, 5, var4++, var6);
                } else if (class295.field4158 == var9) {
                    var3.addElement(var5, 1, 0, 5, var4++, var6);
                } else if (class295.field4159 == var9) {
                    var3.addElement(var5, 2, 0, 5, var4++, var6);
                } else if (class295.field4160 == var9) {
                    var3.addElement(var5, 3, 0, 5, var4++, var6);
                }
                var6 += var9.field4153;
            }
        }
        var3.finish();
        this.field4446 = arg0.field3093.method2893(var3, null);
    }
}
