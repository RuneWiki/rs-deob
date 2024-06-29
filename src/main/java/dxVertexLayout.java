import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dxVertexLayout")
public class dxVertexLayout extends class491 {

    @OriginalMember(owner = "client!dxVertexLayout", name = "h", descriptor = "Ljagdx/IDirect3DVertexDeclaration;")
    public IDirect3DVertexDeclaration field4489;

    @OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Lbfa;[Ljl;)V")
    public dxVertexLayout(class370 arg0, class273[] arg1) {
        VertexElementCollection var3 = new VertexElementCollection(arg0.field5260);
        int var4 = 0;
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = 0;
            class273 var7 = arg1[var5];
            for (int var8 = 0; var7.method1806((byte) -126) > var8; var8++) {
                class11 var9 = var7.method1805(var8, 126);
                if (class11.field149 == var9) {
                    var3.addElement(var5, 2, 0, 0, 0, var6);
                } else if (class11.field151 == var9) {
                    var3.addElement(var5, 2, 0, 3, 0, var6);
                } else if (class11.field152 == var9) {
                    var3.addElement(var5, 4, 0, 10, 0, var6);
                } else if (class11.field153 == var9) {
                    var3.addElement(var5, 0, 0, 5, var4++, var6);
                } else if (class11.field154 == var9) {
                    var3.addElement(var5, 1, 0, 5, var4++, var6);
                } else if (class11.field155 == var9) {
                    var3.addElement(var5, 2, 0, 5, var4++, var6);
                } else if (class11.field156 == var9) {
                    var3.addElement(var5, 3, 0, 5, var4++, var6);
                }
                var6 += var9.field145;
            }
        }
        var3.finish();
        this.field4489 = arg0.field5282.method2847(var3, null);
    }
}
