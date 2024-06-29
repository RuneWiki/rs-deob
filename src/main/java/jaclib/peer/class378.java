package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/ida")
public class class378 {
   @OriginalMember(
      owner = "client!jaclib/peer/ida",
      name = "a",
      descriptor = "Ljava/lang/ref/ReferenceQueue;"
   )
   public ReferenceQueue field5254 = new ReferenceQueue();
   @OriginalMember(
      owner = "client!jaclib/peer/ida",
      name = "c",
      descriptor = "Ljaclib/peer/PeerReference;"
   )
   private PeerReference field5252;
   @OriginalMember(
      owner = "client!jaclib/peer/ida",
      name = "b",
      descriptor = "Ljaclib/peer/PeerReference;"
   )
   private PeerReference field5253;

   @OriginalMember(
      owner = "client!jaclib/peer/ida",
      name = "a",
      descriptor = "(Z)V"
   )
   private final void method2979(boolean arg0) {
      while(true) {
         Reference var2 = this.field5254.poll();
         if (var2 == null) {
            if (!arg0) {
               this.method2980((byte)102);
            }

            return;
         }

         PeerReference var3 = (PeerReference)var2;
         this.method2983(true, var3);
      }
   }

   @OriginalMember(
      owner = "client!jaclib/peer/ida",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method2980(byte arg0) {
      this.method2979(true);
      if (arg0 != 76) {
         this.method2982((PeerReference)null, 64);
      }

   }

   @OriginalMember(
      owner = "client!jaclib/peer/ida",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method2981(int arg0) {
      this.method2979(true);
      if (arg0 != 30982) {
         this.method2983(true, (PeerReference)null);
      }

      while(this.field5253 != null) {
         this.method2983(true, this.field5253);
      }

      this.method2979(true);
   }

   @OriginalMember(
      owner = "client!jaclib/peer/ida",
      name = "a",
      descriptor = "(Ljaclib/peer/PeerReference;I)V"
   )
   public final void method2982(PeerReference arg0, int arg1) {
      arg0.field5251 = null;
      arg0.field5250 = this.field5253;
      if (arg1 != 474) {
         this.method2983(true, (PeerReference)null);
      }

      if (this.field5252 != null) {
         this.field5253.field5251 = arg0;
      } else {
         this.field5252 = arg0;
      }

      this.field5253 = arg0;
   }

   @OriginalMember(
      owner = "client!jaclib/peer/ida",
      name = "a",
      descriptor = "(ZLjaclib/peer/PeerReference;)V"
   )
   private final void method2983(boolean arg0, PeerReference arg1) {
      arg1.method2977(0);
      if (this.field5253 == arg1) {
         this.field5253 = arg1.field5250;
      }

      if (!arg0) {
         this.field5254 = (ReferenceQueue)null;
      }

      if (this.field5252 == arg1) {
         this.field5252 = arg1.field5251;
      }

      if (arg1.field5251 != null) {
         arg1.field5251.field5250 = arg1.field5250;
      }

      if (arg1.field5250 != null) {
         arg1.field5250.field5251 = arg1.field5251;
      }

   }
}
