import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dxVertexLayout")
public class dxVertexLayout extends class251 {

    @OriginalMember(owner = "client!dxVertexLayout", name = "c", descriptor = "Ljagdx/IDirect3DVertexDeclaration;")
    public IDirect3DVertexDeclaration field4360;

    @OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Lbea;[Ldia;)V", line = 3)
    public dxVertexLayout(class225 arg0, class235[] arg1) {
        VertexElementCollection var3 = new VertexElementCollection(arg0.field2928);
        int var4 = 0;
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = 0;
            class235 var7 = arg1[var5];
            for (int var8 = 0; var8 < var7.method1417((byte) -105); var8++) {
                class239 var9 = var7.method1416(var8, (byte) -98);
                if (class239.field3118 == var9) {
                    var3.addElement(var5, 2, 0, 0, 0, var6);
                } else if (class239.field3123 == var9) {
                    var3.addElement(var5, 2, 0, 3, 0, var6);
                } else if (class239.field3124 == var9) {
                    var3.addElement(var5, 4, 0, 10, 0, var6);
                } else if (class239.field3125 == var9) {
                    var3.addElement(var5, 0, 0, 5, var4++, var6);
                } else if (class239.field3127 == var9) {
                    var3.addElement(var5, 1, 0, 5, var4++, var6);
                } else if (class239.field3128 == var9) {
                    var3.addElement(var5, 2, 0, 5, var4++, var6);
                } else if (class239.field3129 == var9) {
                    var3.addElement(var5, 3, 0, 5, var4++, var6);
                }
                var6 += var9.field3120;
            }
        }
        var3.finish();
        this.field4360 = arg0.field2918.method2722(var3, null);
    }
}
