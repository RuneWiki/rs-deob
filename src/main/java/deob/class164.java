package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("fy")
public final class class164 extends class160 implements Runnable {

    @ObfuscatedName("fy.f")
    public InputStream field2043;

    @ObfuscatedName("fy.h")
    public OutputStream field2032;

    @ObfuscatedName("fy.e")
    public Socket field2034;

    @ObfuscatedName("fy.b")
    public boolean field2035 = false;

    @ObfuscatedName("fy.l")
    public class157 field2042;

    @ObfuscatedName("fy.w")
    public class156 field2036;

    @ObfuscatedName("fy.d")
    public byte[] field2040;

    @ObfuscatedName("fy.n")
    public int field2039 = 0;

    @ObfuscatedName("fy.s")
    public int field2037 = 0;

    @ObfuscatedName("fy.g")
    public boolean field2041 = false;

    @ObfuscatedName("fy.a")
    public final int field2033;

    @ObfuscatedName("fy.r")
    public final int field2038;

    public class164(Socket arg0, class157 arg1, int arg2) throws IOException {
        this.field2042 = arg1;
        this.field2034 = arg0;
        this.field2033 = arg2;
        this.field2038 = arg2 - 100;
        this.field2034.setSoTimeout(30000);
        this.field2034.setTcpNoDelay(true);
        this.field2034.setReceiveBufferSize(65536);
        this.field2034.setSendBufferSize(65536);
        this.field2043 = this.field2034.getInputStream();
        this.field2032 = this.field2034.getOutputStream();
    }

    @ObfuscatedName("fy.d(I)V")
    public void method3098() {
        if (this.field2035) {
            return;
        }
        synchronized (this) {
            this.field2035 = true;
            this.notifyAll();
        }
        if (this.field2036 != null) {
            while (this.field2036.field1992 == 0) {
                class194.method3013(1L);
            }
            if (this.field2036.field1992 == 1) {
                try {
                    ((Thread) this.field2036.field1989).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2036 = null;
    }

    public void finalize() {
        this.method3098();
    }

    @ObfuscatedName("fy.b(B)I")
    public int method3088() throws IOException {
        return this.field2035 ? 0 : this.field2043.read();
    }

    @ObfuscatedName("fy.e(S)I")
    public int method3087() throws IOException {
        return this.field2035 ? 0 : this.field2043.available();
    }

    @ObfuscatedName("fy.h(II)Z")
    public boolean method3085(int arg0) throws IOException {
        if (this.field2035) {
            return false;
        } else {
            return this.field2043.available() >= arg0;
        }
    }

    @ObfuscatedName("fy.l([BIII)I")
    public int method3089(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2035) {
            return 0;
        }
        int var4 = arg2;
        while (arg2 > 0) {
            int var5 = this.field2043.read(arg0, arg1, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 += var5;
            arg2 -= var5;
        }
        return var4;
    }

    @ObfuscatedName("fy.al([BIIB)V")
    public void method3126(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2035) {
            return;
        }
        if (this.field2041) {
            this.field2041 = false;
            throw new IOException();
        }
        if (this.field2040 == null) {
            this.field2040 = new byte[this.field2033];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2040[this.field2037] = arg0[arg1 + var5];
                this.field2037 = (this.field2037 + 1) % this.field2033;
                if ((this.field2039 + this.field2038) % this.field2033 == this.field2037) {
                    throw new IOException();
                }
            }
            if (this.field2036 == null) {
                this.field2036 = this.field2042.method3052(this, 3);
            }
            this.notifyAll();
        }
    }

    public void run() {
        try {
            while (true) {
                label84: {
                    int var3;
                    int var4;
                    synchronized (this) {
                        if (this.field2039 == this.field2037) {
                            if (this.field2035) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2039;
                        if (this.field2037 >= this.field2039) {
                            var4 = this.field2037 - this.field2039;
                        } else {
                            var4 = this.field2033 - this.field2039;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2032.write(this.field2040, var3, var4);
                    } catch (IOException var12) {
                        this.field2041 = true;
                    }
                    this.field2039 = (this.field2039 + var4) % this.field2033;
                    try {
                        if (this.field2039 == this.field2037) {
                            this.field2032.flush();
                        }
                    } catch (IOException var11) {
                        this.field2041 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2043 != null) {
                        this.field2043.close();
                    }
                    if (this.field2032 != null) {
                        this.field2032.close();
                    }
                    if (this.field2034 != null) {
                        this.field2034.close();
                    }
                } catch (IOException var10) {
                }
                this.field2040 = null;
                break;
            }
        } catch (Exception var15) {
            class155.method1834((String) null, var15);
        }
    }

    @ObfuscatedName("fy.w([BIII)V")
    public void method3094(byte[] arg0, int arg1, int arg2) throws IOException {
        this.method3126(arg0, arg1, arg2);
    }
}
