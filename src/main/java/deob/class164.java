package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("fn")
public final class class164 extends class160 implements Runnable {

    @ObfuscatedName("fn.y")
    public InputStream field2040;

    @ObfuscatedName("fn.c")
    public OutputStream field2030;

    @ObfuscatedName("fn.n")
    public Socket field2032;

    @ObfuscatedName("fn.u")
    public boolean field2029 = false;

    @ObfuscatedName("fn.i")
    public class157 field2033;

    @ObfuscatedName("fn.r")
    public class156 field2034;

    @ObfuscatedName("fn.j")
    public byte[] field2035;

    @ObfuscatedName("fn.p")
    public int field2036 = 0;

    @ObfuscatedName("fn.e")
    public int field2031 = 0;

    @ObfuscatedName("fn.s")
    public boolean field2038 = false;

    @ObfuscatedName("fn.v")
    public final int field2039;

    @ObfuscatedName("fn.k")
    public final int field2037;

    public class164(Socket arg0, class157 arg1, int arg2) throws IOException {
        this.field2033 = arg1;
        this.field2032 = arg0;
        this.field2039 = arg2;
        this.field2037 = arg2 - 100;
        this.field2032.setSoTimeout(30000);
        this.field2032.setTcpNoDelay(true);
        this.field2032.setReceiveBufferSize(65536);
        this.field2032.setSendBufferSize(65536);
        this.field2040 = this.field2032.getInputStream();
        this.field2030 = this.field2032.getOutputStream();
    }

    @ObfuscatedName("fn.p(I)V")
    public void method3035() {
        if (this.field2029) {
            return;
        }
        synchronized (this) {
            this.field2029 = true;
            this.notifyAll();
        }
        if (this.field2034 != null) {
            while (this.field2034.field1987 == 0) {
                class194.method1689(1L);
            }
            if (this.field2034.field1987 == 1) {
                try {
                    ((Thread) this.field2034.field1992).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2034 = null;
    }

    public void finalize() {
        this.method3035();
    }

    @ObfuscatedName("fn.n(B)I")
    public int method3029() throws IOException {
        return this.field2029 ? 0 : this.field2040.read();
    }

    @ObfuscatedName("fn.c(I)I")
    public int method3041() throws IOException {
        return this.field2029 ? 0 : this.field2040.available();
    }

    @ObfuscatedName("fn.y(II)Z")
    public boolean method3030(int arg0) throws IOException {
        if (this.field2029) {
            return false;
        } else {
            return this.field2040.available() >= arg0;
        }
    }

    @ObfuscatedName("fn.u([BIIB)I")
    public int method3050(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2029) {
            return 0;
        }
        int var4 = arg2;
        while (arg2 > 0) {
            int var5 = this.field2040.read(arg0, arg1, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 += var5;
            arg2 -= var5;
        }
        return var4;
    }

    @ObfuscatedName("fn.aa([BIII)V")
    public void method3076(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2029) {
            return;
        }
        if (this.field2038) {
            this.field2038 = false;
            throw new IOException();
        }
        if (this.field2035 == null) {
            this.field2035 = new byte[this.field2039];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2035[this.field2031] = arg0[arg1 + var5];
                this.field2031 = (this.field2031 + 1) % this.field2039;
                if ((this.field2037 + this.field2036) % this.field2039 == this.field2031) {
                    throw new IOException();
                }
            }
            if (this.field2034 == null) {
                this.field2034 = this.field2033.method2995(this, 3);
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
                        if (this.field2036 == this.field2031) {
                            if (this.field2029) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2036;
                        if (this.field2031 >= this.field2036) {
                            var4 = this.field2031 - this.field2036;
                        } else {
                            var4 = this.field2039 - this.field2036;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2030.write(this.field2035, var3, var4);
                    } catch (IOException var12) {
                        this.field2038 = true;
                    }
                    this.field2036 = (this.field2036 + var4) % this.field2039;
                    try {
                        if (this.field2036 == this.field2031) {
                            this.field2030.flush();
                        }
                    } catch (IOException var11) {
                        this.field2038 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2040 != null) {
                        this.field2040.close();
                    }
                    if (this.field2030 != null) {
                        this.field2030.close();
                    }
                    if (this.field2032 != null) {
                        this.field2032.close();
                    }
                } catch (IOException var10) {
                }
                this.field2035 = null;
                break;
            }
        } catch (Exception var15) {
            class155.method917((String) null, var15);
        }
    }

    @ObfuscatedName("fn.i([BIII)V")
    public void method3031(byte[] arg0, int arg1, int arg2) throws IOException {
        this.method3076(arg0, arg1, arg2);
    }
}
