import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dxVertexLayout")
public class dxVertexLayout extends class728 {

    @OriginalMember(owner = "client!dxVertexLayout", name = "h", descriptor = "Ljagdx/IDirect3DVertexDeclaration;")
    public IDirect3DVertexDeclaration field5299;

    @OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Lsd;[Laia;)V", line = 3)
    public dxVertexLayout(class103 arg0, class240[] arg1) {
        VertexElementCollection var3 = new VertexElementCollection(arg0.field1165);
        int var4 = 0;
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = 0;
            class240 var7 = arg1[var5];
            for (int var8 = 0; var7.method2054(15) > var8; var8++) {
                class778 var9 = var7.method2057(var8, 255);
                if (class778.field11295 == var9) {
                    var3.addElement(var5, 2, 0, 0, 0, var6);
                } else if (class778.field11300 == var9) {
                    var3.addElement(var5, 2, 0, 3, 0, var6);
                } else if (class778.field11302 == var9) {
                    var3.addElement(var5, 4, 0, 10, 0, var6);
                } else if (class778.field11303 == var9) {
                    var3.addElement(var5, 0, 0, 5, var4++, var6);
                } else if (class778.field11304 == var9) {
                    var3.addElement(var5, 1, 0, 5, var4++, var6);
                } else if (class778.field11305 == var9) {
                    var3.addElement(var5, 2, 0, 5, var4++, var6);
                } else if (class778.field11306 == var9) {
                    var3.addElement(var5, 3, 0, 5, var4++, var6);
                }
                var6 += var9.field11294;
            }
        }
        var3.finish();
        this.field5299 = arg0.field1151.method3829(var3, null);
    }
}
