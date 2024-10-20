package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("fp")
public final class class172 extends class305 implements Runnable {

    @ObfuscatedName("fp.c")
    public InputStream field2034;

    @ObfuscatedName("fp.x")
    public OutputStream field2043;

    @ObfuscatedName("fp.t")
    public Socket field2032;

    @ObfuscatedName("fp.g")
    public boolean field2035 = false;

    @ObfuscatedName("fp.l")
    public class167 field2036;

    @ObfuscatedName("fp.u")
    public class166 field2037;

    @ObfuscatedName("fp.j")
    public byte[] field2038;

    @ObfuscatedName("fp.v")
    public int field2039 = 0;

    @ObfuscatedName("fp.d")
    public int field2040 = 0;

    @ObfuscatedName("fp.z")
    public boolean field2041 = false;

    @ObfuscatedName("fp.n")
    public final int field2042;

    @ObfuscatedName("fp.h")
    public final int field2033;

    public class172(Socket arg0, class167 arg1, int arg2) throws IOException {
        this.field2036 = arg1;
        this.field2032 = arg0;
        this.field2042 = arg2;
        this.field2033 = arg2 - 100;
        this.field2032.setSoTimeout(30000);
        this.field2032.setTcpNoDelay(true);
        this.field2032.setReceiveBufferSize(65536);
        this.field2032.setSendBufferSize(65536);
        this.field2034 = this.field2032.getInputStream();
        this.field2043 = this.field2032.getOutputStream();
    }

    @ObfuscatedName("fp.c(B)V")
    public void method3242() {
        if (this.field2035) {
            return;
        }
        synchronized (this) {
            this.field2035 = true;
            this.notifyAll();
        }
        if (this.field2037 != null) {
            while (this.field2037.field1998 == 0) {
                class298.method4811(1L);
            }
            if (this.field2037.field1998 == 1) {
                try {
                    ((Thread) this.field2037.field2002).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2037 = null;
    }

    public void finalize() {
        this.method3242();
    }

    @ObfuscatedName("fp.x(I)I")
    public int method3262() throws IOException {
        return this.field2035 ? 0 : this.field2034.read();
    }

    @ObfuscatedName("fp.t(I)I")
    public int method3263() throws IOException {
        return this.field2035 ? 0 : this.field2034.available();
    }

    @ObfuscatedName("fp.g(II)Z")
    public boolean method3257(int arg0) throws IOException {
        if (this.field2035) {
            return false;
        } else {
            return this.field2034.available() >= arg0;
        }
    }

    @ObfuscatedName("fp.l([BIII)I")
    public int method3247(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2035) {
            return 0;
        }
        int var4 = arg2;
        while (arg2 > 0) {
            int var5 = this.field2034.read(arg0, arg1, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 += var5;
            arg2 -= var5;
        }
        return var4;
    }

    @ObfuscatedName("fp.u([BIIB)V")
    public void method3248(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2035) {
            return;
        }
        if (this.field2041) {
            this.field2041 = false;
            throw new IOException();
        }
        if (this.field2038 == null) {
            this.field2038 = new byte[this.field2042];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2038[this.field2040] = arg0[arg1 + var5];
                this.field2040 = (this.field2040 + 1) % this.field2042;
                if ((this.field2039 + this.field2033) % this.field2042 == this.field2040) {
                    throw new IOException();
                }
            }
            if (this.field2037 == null) {
                this.field2037 = this.field2036.method3195(this, 3);
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
                        if (this.field2040 == this.field2039) {
                            if (this.field2035) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2039;
                        if (this.field2040 >= this.field2039) {
                            var4 = this.field2040 - this.field2039;
                        } else {
                            var4 = this.field2042 - this.field2039;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2043.write(this.field2038, var3, var4);
                    } catch (IOException var12) {
                        this.field2041 = true;
                    }
                    this.field2039 = (this.field2039 + var4) % this.field2042;
                    try {
                        if (this.field2040 == this.field2039) {
                            this.field2043.flush();
                        }
                    } catch (IOException var11) {
                        this.field2041 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2034 != null) {
                        this.field2034.close();
                    }
                    if (this.field2043 != null) {
                        this.field2043.close();
                    }
                    if (this.field2032 != null) {
                        this.field2032.close();
                    }
                } catch (IOException var10) {
                }
                this.field2038 = null;
                break;
            }
        } catch (Exception var15) {
            class341.method3361((String) null, var15);
        }
    }

    @ObfuscatedName("fp.j([BIIB)V")
    public void method3250(byte[] arg0, int arg1, int arg2) throws IOException {
        this.method3248(arg0, arg1, arg2);
    }
}
