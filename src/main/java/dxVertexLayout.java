import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dxVertexLayout")
public class dxVertexLayout extends class403 {
   @OriginalMember(
      owner = "client!dxVertexLayout",
      name = "f",
      descriptor = "Ljagdx/IDirect3DVertexDeclaration;"
   )
   public IDirect3DVertexDeclaration field4905;

   @OriginalMember(
      owner = "client!dxVertexLayout",
      name = "<init>",
      descriptor = "(Lvn;[Lfu;)V"
   )
   public dxVertexLayout(class332 arg0, class414[] arg1) {
      VertexElementCollection var3 = new VertexElementCollection(arg0.field4749);
      int var4 = 0;

      for(int var5 = 0; var5 < arg1.length; ++var5) {
         int var6 = 0;
         class414 var7 = arg1[var5];

         for(int var8 = 0; var7.method3133((byte)23) > var8; ++var8) {
            class727 var9 = var7.method3135(var8, (byte)-114);
            if (class727.field10647 != var9) {
               if (class727.field10650 == var9) {
                  var3.addElement(var5, 2, 0, 3, 0, var6);
               } else if (class727.field10651 == var9) {
                  var3.addElement(var5, 4, 0, 10, 0, var6);
               } else if (class727.field10652 != var9) {
                  if (class727.field10653 == var9) {
                     var3.addElement(var5, 1, 0, 5, var4++, var6);
                  } else if (class727.field10654 != var9) {
                     if (class727.field10655 == var9) {
                        var3.addElement(var5, 3, 0, 5, var4++, var6);
                     }
                  } else {
                     var3.addElement(var5, 2, 0, 5, var4++, var6);
                  }
               } else {
                  var3.addElement(var5, 0, 0, 5, var4++, var6);
               }
            } else {
               var3.addElement(var5, 2, 0, 0, 0, var6);
            }

            var6 += var9.field10641;
         }
      }

      var3.finish();
      this.field4905 = arg0.field4766.method3721(var3, (IDirect3DVertexDeclaration)null);
   }
}
