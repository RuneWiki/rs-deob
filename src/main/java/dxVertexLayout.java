import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dxVertexLayout")
public class dxVertexLayout extends class313 {

    @OriginalMember(owner = "client!dxVertexLayout", name = "i", descriptor = "Ljagdx/IDirect3DVertexDeclaration;")
    public IDirect3DVertexDeclaration field5560;

    @OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Ler;[Lgt;)V", line = 3)
    public dxVertexLayout(class113 arg0, class482[] arg1) {
        VertexElementCollection var3 = new VertexElementCollection(arg0.field1591);
        int var4 = 0;
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = 0;
            class482 var7 = arg1[var5];
            for (int var8 = 0; var7.method3676(15) > var8; var8++) {
                class771 var9 = var7.method3677(var8, -25596);
                if (class771.field11297 == var9) {
                    var3.addElement(var5, 2, 0, 0, 0, var6);
                } else if (class771.field11298 == var9) {
                    var3.addElement(var5, 2, 0, 3, 0, var6);
                } else if (class771.field11300 == var9) {
                    var3.addElement(var5, 4, 0, 10, 0, var6);
                } else if (class771.field11303 == var9) {
                    var3.addElement(var5, 0, 0, 5, var4++, var6);
                } else if (class771.field11304 == var9) {
                    var3.addElement(var5, 1, 0, 5, var4++, var6);
                } else if (class771.field11305 == var9) {
                    var3.addElement(var5, 2, 0, 5, var4++, var6);
                } else if (class771.field11306 == var9) {
                    var3.addElement(var5, 3, 0, 5, var4++, var6);
                }
                var6 += var9.field11294;
            }
        }
        var3.finish();
        this.field5560 = arg0.field1575.method3833(var3, null);
    }
}
