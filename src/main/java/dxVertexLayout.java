import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dxVertexLayout")
public class dxVertexLayout extends class418 {
   @OriginalMember(
      owner = "client!dxVertexLayout",
      name = "j",
      descriptor = "Ljagdx/IDirect3DVertexDeclaration;"
   )
   public IDirect3DVertexDeclaration field4653;

   @OriginalMember(
      owner = "client!dxVertexLayout",
      name = "<init>",
      descriptor = "(Lbb;[Lhja;)V",
      line = 3
   )
   public dxVertexLayout(class353 arg0, class430[] arg1) {
      VertexElementCollection var3 = new VertexElementCollection(arg0.field4757);
      int var4 = 0;

      for(int var5 = 0; var5 < arg1.length; ++var5) {
         int var6 = 0;
         class430 var7 = arg1[var5];

         for(int var8 = 0; var8 < var7.method3182(69); ++var8) {
            class744 var9 = var7.method3178((byte)0, var8);
            if (class744.field10836 == var9) {
               var3.addElement(var5, 2, 0, 0, 0, var6);
            } else if (class744.field10842 == var9) {
               var3.addElement(var5, 2, 0, 3, 0, var6);
            } else if (class744.field10846 != var9) {
               if (class744.field10847 == var9) {
                  var3.addElement(var5, 0, 0, 5, var4++, var6);
               } else if (class744.field10848 != var9) {
                  if (class744.field10849 == var9) {
                     var3.addElement(var5, 2, 0, 5, var4++, var6);
                  } else if (class744.field10850 == var9) {
                     var3.addElement(var5, 3, 0, 5, var4++, var6);
                  }
               } else {
                  var3.addElement(var5, 1, 0, 5, var4++, var6);
               }
            } else {
               var3.addElement(var5, 4, 0, 10, 0, var6);
            }

            var6 += var9.field10841;
         }
      }

      var3.finish();
      this.field4653 = arg0.field4742.method3717(var3, (IDirect3DVertexDeclaration)null);
   }
}
