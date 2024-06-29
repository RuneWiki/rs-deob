import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dxVertexLayout")
public class dxVertexLayout extends class254 {

    @OriginalMember(owner = "client!dxVertexLayout", name = "e", descriptor = "Ljagdx/IDirect3DVertexDeclaration;")
    public IDirect3DVertexDeclaration field4616;

    @OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Lfi;[Lbq;)V")
    public dxVertexLayout(class558 arg0, class290[] arg1) {
        VertexElementCollection var3 = new VertexElementCollection(arg0.field7963);
        int var4 = 0;
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = 0;
            class290 var7 = arg1[var5];
            for (int var8 = 0; var7.method1857(1) > var8; var8++) {
                class369 var9 = var7.method1851((byte) -52, var8);
                if (class369.field5301 == var9) {
                    var3.addElement(var5, 2, 0, 0, 0, var6);
                } else if (class369.field5308 == var9) {
                    var3.addElement(var5, 2, 0, 3, 0, var6);
                } else if (class369.field5309 == var9) {
                    var3.addElement(var5, 4, 0, 10, 0, var6);
                } else if (class369.field5310 == var9) {
                    var3.addElement(var5, 0, 0, 5, var4++, var6);
                } else if (class369.field5311 == var9) {
                    var3.addElement(var5, 1, 0, 5, var4++, var6);
                } else if (class369.field5312 == var9) {
                    var3.addElement(var5, 2, 0, 5, var4++, var6);
                } else if (class369.field5313 == var9) {
                    var3.addElement(var5, 3, 0, 5, var4++, var6);
                }
                var6 += var9.field5306;
            }
        }
        var3.finish();
        this.field4616 = arg0.field7959.method2901(var3, null);
    }
}
