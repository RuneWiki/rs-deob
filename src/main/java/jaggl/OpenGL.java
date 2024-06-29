package jaggl;

import java.awt.Canvas;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/OpenGL")
public class OpenGL {

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "a", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field6235 = new Hashtable();

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "peer", descriptor = "J")
    public long peer;

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "b", descriptor = "Ljava/lang/Thread;")
    private Thread field6236;

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "c", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field6237;

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "attach", descriptor = "()Z", line = 1148)
    public synchronized boolean attach() {
        Thread var1 = Thread.currentThread();
        if (!this.attachPeer()) {
            return false;
        }
        OpenGL var2 = (OpenGL) field6235.put(var1, this);
        if (var2 != null) {
            var2.field6236 = null;
        }
        this.field6236 = var1;
        return true;
    }

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "detach", descriptor = "()Z", line = 1223)
    public synchronized boolean detach() {
        if (this.field6236 == Thread.currentThread()) {
            this.detachPeer();
            field6235.remove(this.field6236);
            this.field6236 = null;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "getCurrent", descriptor = "()Ljaggl/OpenGL;", line = 1601)
    public static OpenGL getCurrent() {
        return (OpenGL) field6235.get(Thread.currentThread());
    }

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "isExtensionAvailable", descriptor = "(Ljava/lang/String;)Z", line = 2544)
    public boolean isExtensionAvailable(String arg0) {
        if (this.field6237 == null) {
            this.field6237 = new Hashtable();
            String var2 = glGetString(7939);
            int var3 = 0;
            while (true) {
                int var4 = var2.indexOf(32, var3);
                if (var4 == -1) {
                    String var6 = var2.substring(var3).trim();
                    if (var6.length() != 0) {
                        this.field6237.put(var6, var6);
                    }
                    break;
                }
                String var5 = var2.substring(var3, var4).trim();
                if (var5.length() != 0) {
                    this.field6237.put(var5, var5);
                }
                var3 = var4 + 1;
            }
        }
        return this.field6237.containsKey(arg0);
    }

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glClearDepth", descriptor = "(F)V")
    public static native void glClearDepth(float arg0);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glDeleteBuffersARB", descriptor = "(I[II)V")
    public static native void glDeleteBuffersARB(int arg0, int[] arg1, int arg2);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glReadPixelsi", descriptor = "(IIIIII[II)V")
    public static native void glReadPixelsi(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glPixelStorei", descriptor = "(II)V")
    public static native void glPixelStorei(int arg0, int arg1);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glUseProgramObjectARB", descriptor = "(J)V")
    public static native void glUseProgramObjectARB(long arg0);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glProgramStringARB", descriptor = "(IILjava/lang/String;)V")
    public static native void glProgramStringARB(int arg0, int arg1, String arg2);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glMatrixMode", descriptor = "(I)V")
    public static native void glMatrixMode(int arg0);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "releasePbuffer", descriptor = "(J)V")
    public native void releasePbuffer(long arg0);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glTexEnvf", descriptor = "(IIF)V")
    public static native void glTexEnvf(int arg0, int arg1, float arg2);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glGenRenderbuffersEXT", descriptor = "(I[II)V")
    public static native void glGenRenderbuffersEXT(int arg0, int[] arg1, int arg2);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "swapBuffers", descriptor = "()V")
    public native void swapBuffers();

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "release", descriptor = "()V")
    public native void release();

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glTexParameteri", descriptor = "(III)V")
    public static native void glTexParameteri(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glDrawPixelsi", descriptor = "(IIII[II)V")
    public static native void glDrawPixelsi(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glTexEnvfv", descriptor = "(II[FI)V")
    public static native void glTexEnvfv(int arg0, int arg1, float[] arg2, int arg3);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glTexCoord2i", descriptor = "(II)V")
    public static native void glTexCoord2i(int arg0, int arg1);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glVertexPointer", descriptor = "(IIIJ)V")
    public static native void glVertexPointer(int arg0, int arg1, int arg2, long arg3);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glPopAttrib", descriptor = "()V")
    public static native void glPopAttrib();

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glClear", descriptor = "(I)V")
    public static native void glClear(int arg0);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "surfaceResized", descriptor = "(J)V")
    public native void surfaceResized(long arg0);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glFrustum", descriptor = "(DDDDDD)V")
    public static native void glFrustum(double arg0, double arg1, double arg2, double arg3, double arg4, double arg5);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glTexParameterf", descriptor = "(IIF)V")
    public static native void glTexParameterf(int arg0, int arg1, float arg2);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glDeleteRenderbuffersEXT", descriptor = "(I[II)V")
    public static native void glDeleteRenderbuffersEXT(int arg0, int[] arg1, int arg2);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glDeleteProgramARB", descriptor = "(I)V")
    public static native void glDeleteProgramARB(int arg0);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glGenTextures", descriptor = "(I[II)V")
    public static native void glGenTextures(int arg0, int[] arg1, int arg2);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glGetProgramivARB", descriptor = "(II[II)V")
    public static native void glGetProgramivARB(int arg0, int arg1, int[] arg2, int arg3);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glColor3f", descriptor = "(FFF)V")
    public static native void glColor3f(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glTexImage3Dub", descriptor = "(IIIIIIIII[BI)V")
    public static native void glTexImage3Dub(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte[] arg9, int arg10);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glUniform1fARB", descriptor = "(IF)V")
    public static native void glUniform1fARB(int arg0, float arg1);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glGetObjectParameterivARB", descriptor = "(JI[II)V")
    public static native void glGetObjectParameterivARB(long arg0, int arg1, int[] arg2, int arg3);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glDepthFunc", descriptor = "(I)V")
    public static native void glDepthFunc(int arg0);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glBindFramebufferEXT", descriptor = "(II)V")
    public static native void glBindFramebufferEXT(int arg0, int arg1);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "releaseSurface", descriptor = "(Ljava/awt/Canvas;J)V")
    public native void releaseSurface(Canvas arg0, long arg1);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glMaterialfv", descriptor = "(II[FI)V")
    public static native void glMaterialfv(int arg0, int arg1, float[] arg2, int arg3);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glDeleteObjectARB", descriptor = "(J)V")
    public static native void glDeleteObjectARB(long arg0);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glDisableClientState", descriptor = "(I)V")
    public static native void glDisableClientState(int arg0);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glPixelZoom", descriptor = "(FF)V")
    public static native void glPixelZoom(float arg0, float arg1);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glVertex2i", descriptor = "(II)V")
    public static native void glVertex2i(int arg0, int arg1);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glDrawBuffersARB", descriptor = "(I[II)V")
    public static native void glDrawBuffersARB(int arg0, int[] arg1, int arg2);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glGetFloatv", descriptor = "(I[FI)V")
    public static native void glGetFloatv(int arg0, float[] arg1, int arg2);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "init", descriptor = "(Ljava/awt/Canvas;IIIIII)J")
    public native long init(Canvas arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glLightfv", descriptor = "(II[FI)V")
    public static native void glLightfv(int arg0, int arg1, float[] arg2, int arg3);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glFinish", descriptor = "()V")
    public static native void glFinish();

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glLoadIdentity", descriptor = "()V")
    public static native void glLoadIdentity();

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glMultiTexCoord2f", descriptor = "(IFF)V")
    public static native void glMultiTexCoord2f(int arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glTexEnvi", descriptor = "(III)V")
    public static native void glTexEnvi(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glTranslatef", descriptor = "(FFF)V")
    public static native void glTranslatef(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glViewport", descriptor = "(IIII)V")
    public static native void glViewport(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glLinkProgramARB", descriptor = "(J)V")
    public static native void glLinkProgramARB(long arg0);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glGetUniformLocationARB", descriptor = "(JLjava/lang/String;)I")
    public static native int glGetUniformLocationARB(long arg0, String arg1);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glDeleteTextures", descriptor = "(I[II)V")
    public static native void glDeleteTextures(int arg0, int[] arg1, int arg2);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glOrtho", descriptor = "(DDDDDD)V")
    public static native void glOrtho(double arg0, double arg1, double arg2, double arg3, double arg4, double arg5);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glBlitFramebufferEXT", descriptor = "(IIIIIIIIII)V")
    public static native void glBlitFramebufferEXT(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glGetString", descriptor = "(I)Ljava/lang/String;")
    public static native String glGetString(int arg0);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glLineWidth", descriptor = "(F)V")
    public static native void glLineWidth(float arg0);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glFramebufferRenderbufferEXT", descriptor = "(IIII)V")
    public static native void glFramebufferRenderbufferEXT(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glGetIntegerv", descriptor = "(I[II)V")
    public static native void glGetIntegerv(int arg0, int[] arg1, int arg2);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glNormalPointer", descriptor = "(IIJ)V")
    public static native void glNormalPointer(int arg0, int arg1, long arg2);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glScalef", descriptor = "(FFF)V")
    public static native void glScalef(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glDeleteLists", descriptor = "(II)V")
    public static native void glDeleteLists(int arg0, int arg1);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glEnableClientState", descriptor = "(I)V")
    public static native void glEnableClientState(int arg0);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glActiveTexture", descriptor = "(I)V")
    public static native void glActiveTexture(int arg0);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glPolygonMode", descriptor = "(II)V")
    public static native void glPolygonMode(int arg0, int arg1);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glMultMatrixf", descriptor = "([FI)V")
    public static native void glMultMatrixf(float[] arg0, int arg1);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glShaderSourceARB", descriptor = "(JLjava/lang/String;)V")
    public static native void glShaderSourceARB(long arg0, String arg1);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glTexImage2Dub", descriptor = "(IIIIIIII[BI)V")
    public static native void glTexImage2Dub(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8, int arg9);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glUniform2fARB", descriptor = "(IFF)V")
    public static native void glUniform2fARB(int arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glClientActiveTexture", descriptor = "(I)V")
    public static native void glClientActiveTexture(int arg0);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glVertex2f", descriptor = "(FF)V")
    public static native void glVertex2f(float arg0, float arg1);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glRenderbufferStorageMultisampleEXT", descriptor = "(IIIII)V")
    public static native void glRenderbufferStorageMultisampleEXT(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glProgramLocalParameter4fvARB", descriptor = "(II[FI)V")
    public static native void glProgramLocalParameter4fvARB(int arg0, int arg1, float[] arg2, int arg3);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glNewList", descriptor = "(II)V")
    public static native void glNewList(int arg0, int arg1);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "createPbuffer", descriptor = "(II)J")
    public native long createPbuffer(int arg0, int arg1);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glColorMask", descriptor = "(ZZZZ)V")
    public static native void glColorMask(boolean arg0, boolean arg1, boolean arg2, boolean arg3);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glFogf", descriptor = "(IF)V")
    public static native void glFogf(int arg0, float arg1);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glCreateProgramObjectARB", descriptor = "()J")
    public static native long glCreateProgramObjectARB();

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glRenderbufferStorageEXT", descriptor = "(IIII)V")
    public static native void glRenderbufferStorageEXT(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glBufferDataARBa", descriptor = "(IIJI)V")
    public static native void glBufferDataARBa(int arg0, int arg1, long arg2, int arg3);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glFlush", descriptor = "()V")
    public static native void glFlush();

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glCopyTexSubImage3D", descriptor = "(IIIIIIIII)V")
    public static native void glCopyTexSubImage3D(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glUniform1iARB", descriptor = "(II)V")
    public static native void glUniform1iARB(int arg0, int arg1);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glRotatef", descriptor = "(FFFF)V")
    public static native void glRotatef(float arg0, float arg1, float arg2, float arg3);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "arePbuffersAvailable", descriptor = "()Z")
    public native boolean arePbuffersAvailable();

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glPixelTransferf", descriptor = "(IF)V")
    public static native void glPixelTransferf(int arg0, float arg1);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glHint", descriptor = "(II)V")
    public static native void glHint(int arg0, int arg1);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glEnable", descriptor = "(I)V")
    public static native void glEnable(int arg0);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glTexGeni", descriptor = "(III)V")
    public static native void glTexGeni(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glCopyTexSubImage2D", descriptor = "(IIIIIIII)V")
    public static native void glCopyTexSubImage2D(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glDepthMask", descriptor = "(Z)V")
    public static native void glDepthMask(boolean arg0);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glTexSubImage2Dub", descriptor = "(IIIIIIII[BI)V")
    public static native void glTexSubImage2Dub(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8, int arg9);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glDrawArrays", descriptor = "(III)V")
    public static native void glDrawArrays(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glDrawPixelsub", descriptor = "(IIII[BI)V")
    public static native void glDrawPixelsub(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glDrawBuffer", descriptor = "(I)V")
    public static native void glDrawBuffer(int arg0);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glGenLists", descriptor = "(I)I")
    public static native int glGenLists(int arg0);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glProgramLocalParameter4fARB", descriptor = "(IIFFFF)V")
    public static native void glProgramLocalParameter4fARB(int arg0, int arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glGetError", descriptor = "()I")
    public static native int glGetError();

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glFogfv", descriptor = "(I[FI)V")
    public static native void glFogfv(int arg0, float[] arg1, int arg2);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glBindProgramARB", descriptor = "(II)V")
    public static native void glBindProgramARB(int arg0, int arg1);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glReadBuffer", descriptor = "(I)V")
    public static native void glReadBuffer(int arg0);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glEndList", descriptor = "()V")
    public static native void glEndList();

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "detachPeer", descriptor = "()V")
    private native void detachPeer();

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glFramebufferTexture2DEXT", descriptor = "(IIIII)V")
    public static native void glFramebufferTexture2DEXT(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glBindTexture", descriptor = "(II)V")
    public static native void glBindTexture(int arg0, int arg1);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glTexImage1Dub", descriptor = "(IIIIIII[BI)V")
    public static native void glTexImage1Dub(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, int arg8);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glPushAttrib", descriptor = "(I)V")
    public static native void glPushAttrib(int arg0);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glFramebufferTexture3DEXT", descriptor = "(IIIIII)V")
    public static native void glFramebufferTexture3DEXT(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glFogi", descriptor = "(II)V")
    public static native void glFogi(int arg0, int arg1);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glBufferDataARBub", descriptor = "(II[BII)V")
    public static native void glBufferDataARBub(int arg0, int arg1, byte[] arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glPointSize", descriptor = "(F)V")
    public static native void glPointSize(float arg0);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glGenerateMipmapEXT", descriptor = "(I)V")
    public static native void glGenerateMipmapEXT(int arg0);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glTexImage2Di", descriptor = "(IIIIIIII[II)V")
    public static native void glTexImage2Di(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glCreateShaderObjectARB", descriptor = "(I)J")
    public static native long glCreateShaderObjectARB(int arg0);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glGetInfoLogARB", descriptor = "(JI[II[BI)V")
    public static native void glGetInfoLogARB(long arg0, int arg1, int[] arg2, int arg3, byte[] arg4, int arg5);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glPopMatrix", descriptor = "()V")
    public static native void glPopMatrix();

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glLoadMatrixf", descriptor = "([FI)V")
    public static native void glLoadMatrixf(float[] arg0, int arg1);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glColor4f", descriptor = "(FFFF)V")
    public static native void glColor4f(float arg0, float arg1, float arg2, float arg3);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glLightModelfv", descriptor = "(I[FI)V")
    public static native void glLightModelfv(int arg0, float[] arg1, int arg2);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glBlendFunc", descriptor = "(II)V")
    public static native void glBlendFunc(int arg0, int arg1);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glScissor", descriptor = "(IIII)V")
    public static native void glScissor(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glTexCoordPointer", descriptor = "(IIIJ)V")
    public static native void glTexCoordPointer(int arg0, int arg1, int arg2, long arg3);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glGenBuffersARB", descriptor = "(I[II)V")
    public static native void glGenBuffersARB(int arg0, int[] arg1, int arg2);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glBufferSubDataARB", descriptor = "(III[BI)V")
    public static native void glBufferSubDataARB(int arg0, int arg1, int arg2, byte[] arg3, int arg4);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glShadeModel", descriptor = "(I)V")
    public static native void glShadeModel(int arg0);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glUniform4fARB", descriptor = "(IFFFF)V")
    public static native void glUniform4fARB(int arg0, float arg1, float arg2, float arg3, float arg4);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "prepareSurface", descriptor = "(Ljava/awt/Canvas;)J")
    public native long prepareSurface(Canvas arg0);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glClearColor", descriptor = "(FFFF)V")
    public static native void glClearColor(float arg0, float arg1, float arg2, float arg3);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glTexCoord3f", descriptor = "(FFF)V")
    public static native void glTexCoord3f(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glDetachObjectARB", descriptor = "(JJ)V")
    public static native void glDetachObjectARB(long arg0, long arg1);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glTexGenfv", descriptor = "(II[FI)V")
    public static native void glTexGenfv(int arg0, int arg1, float[] arg2, int arg3);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glDrawElements", descriptor = "(IIIJ)V")
    public static native void glDrawElements(int arg0, int arg1, int arg2, long arg3);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glCopyTexImage2D", descriptor = "(IIIIIIII)V")
    public static native void glCopyTexImage2D(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glColorPointer", descriptor = "(IIIJ)V")
    public static native void glColorPointer(int arg0, int arg1, int arg2, long arg3);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glBindBufferARB", descriptor = "(II)V")
    public static native void glBindBufferARB(int arg0, int arg1);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glRasterPos2i", descriptor = "(II)V")
    public static native void glRasterPos2i(int arg0, int arg1);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glTexCoord2f", descriptor = "(FF)V")
    public static native void glTexCoord2f(float arg0, float arg1);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glGenProgramARB", descriptor = "()I")
    public static native int glGenProgramARB();

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glCallList", descriptor = "(I)V")
    public static native void glCallList(int arg0);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glBindRenderbufferEXT", descriptor = "(II)V")
    public static native void glBindRenderbufferEXT(int arg0, int arg1);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glTexSubImage2Di", descriptor = "(IIIIIIII[II)V")
    public static native void glTexSubImage2Di(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glCullFace", descriptor = "(I)V")
    public static native void glCullFace(int arg0);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glGenFramebuffersEXT", descriptor = "(I[II)V")
    public static native void glGenFramebuffersEXT(int arg0, int[] arg1, int arg2);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glTexSubImage2Df", descriptor = "(IIIIIIII[FI)V")
    public static native void glTexSubImage2Df(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, float[] arg8, int arg9);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glColor4ub", descriptor = "(BBBB)V")
    public static native void glColor4ub(byte arg0, byte arg1, byte arg2, byte arg3);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glDeleteFramebuffersEXT", descriptor = "(I[II)V")
    public static native void glDeleteFramebuffersEXT(int arg0, int[] arg1, int arg2);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glCompileShaderARB", descriptor = "(J)V")
    public static native void glCompileShaderARB(long arg0);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glColor3ub", descriptor = "(BBB)V")
    public static native void glColor3ub(byte arg0, byte arg1, byte arg2);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "setSwapInterval", descriptor = "(I)V")
    public native void setSwapInterval(int arg0);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glVertex3f", descriptor = "(FFF)V")
    public static native void glVertex3f(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glCopyPixels", descriptor = "(IIIII)V")
    public static native void glCopyPixels(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glMultiTexCoord2i", descriptor = "(III)V")
    public static native void glMultiTexCoord2i(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glBegin", descriptor = "(I)V")
    public static native void glBegin(int arg0);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "setSurface", descriptor = "(J)Z")
    public native boolean setSurface(long arg0);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "attachPeer", descriptor = "()Z")
    private native boolean attachPeer();

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glAttachObjectARB", descriptor = "(JJ)V")
    public static native void glAttachObjectARB(long arg0, long arg1);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glNormal3f", descriptor = "(FFF)V")
    public static native void glNormal3f(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glAlphaFunc", descriptor = "(IF)V")
    public static native void glAlphaFunc(int arg0, float arg1);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glLightf", descriptor = "(IIF)V")
    public static native void glLightf(int arg0, int arg1, float arg2);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glCheckFramebufferStatusEXT", descriptor = "(I)I")
    public static native int glCheckFramebufferStatusEXT(int arg0);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glEnd", descriptor = "()V")
    public static native void glEnd();

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glColorMaterial", descriptor = "(II)V")
    public static native void glColorMaterial(int arg0, int arg1);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glPushMatrix", descriptor = "()V")
    public static native void glPushMatrix();

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glUniform3fARB", descriptor = "(IFFF)V")
    public static native void glUniform3fARB(int arg0, float arg1, float arg2, float arg3);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glReadPixelsub", descriptor = "(IIIIII[BI)V")
    public static native void glReadPixelsub(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glTexImage2Df", descriptor = "(IIIIIIII[FI)V")
    public static native void glTexImage2Df(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, float[] arg8, int arg9);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "setPbuffer", descriptor = "(J)V")
    public native void setPbuffer(long arg0);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glDisable", descriptor = "(I)V")
    public static native void glDisable(int arg0);
}
