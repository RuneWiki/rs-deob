import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dxVertexLayout")
public class dxVertexLayout extends class218 {

    @OriginalMember(owner = "client!dxVertexLayout", name = "e", descriptor = "Ljagdx/IDirect3DVertexDeclaration;")
    public IDirect3DVertexDeclaration field6292;

    @OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Los;[Luc;)V")
    public dxVertexLayout(class253 arg0, class121[] arg1) {
        VertexElementCollection var3 = new VertexElementCollection(arg0.field3621);
        int var4 = 0;
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = 0;
            class121 var7 = arg1[var5];
            for (int var8 = 0; var8 < var7.method1090((byte) 28); var8++) {
                class212 var9 = var7.method1095(-24983, var8);
                if (class212.field3105 == var9) {
                    var3.addElement(var5, 2, 0, 0, 0, var6);
                } else if (class212.field3110 == var9) {
                    var3.addElement(var5, 2, 0, 3, 0, var6);
                } else if (class212.field3111 == var9) {
                    var3.addElement(var5, 4, 0, 10, 0, var6);
                } else if (class212.field3112 == var9) {
                    var3.addElement(var5, 0, 0, 5, var4++, var6);
                } else if (class212.field3113 == var9) {
                    var3.addElement(var5, 1, 0, 5, var4++, var6);
                } else if (class212.field3114 == var9) {
                    var3.addElement(var5, 2, 0, 5, var4++, var6);
                } else if (class212.field3115 == var9) {
                    var3.addElement(var5, 3, 0, 5, var4++, var6);
                }
                var6 += var9.field3108;
            }
        }
        var3.finish();
        this.field6292 = arg0.field3618.method3135(var3, null);
    }
}
