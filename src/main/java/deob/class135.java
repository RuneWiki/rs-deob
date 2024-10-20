package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("en")
public final class class135 implements Runnable {

    @ObfuscatedName("en.q")
    public InputStream field2029;

    @ObfuscatedName("en.s")
    public OutputStream field2027;

    @ObfuscatedName("en.h")
    public Socket field2032;

    @ObfuscatedName("en.e")
    public boolean field2034 = false;

    @ObfuscatedName("en.n")
    public class128 field2030;

    @ObfuscatedName("en.t")
    public class138 field2031;

    @ObfuscatedName("en.l")
    public byte[] field2028;

    @ObfuscatedName("en.m")
    public int field2033 = 0;

    @ObfuscatedName("en.o")
    public int field2036 = 0;

    @ObfuscatedName("en.k")
    public boolean field2035 = false;

    public class135(Socket arg0, class128 arg1) throws IOException {
        this.field2030 = arg1;
        this.field2032 = arg0;
        this.field2032.setSoTimeout(30000);
        this.field2032.setTcpNoDelay(true);
        this.field2029 = this.field2032.getInputStream();
        this.field2027 = this.field2032.getOutputStream();
    }

    @ObfuscatedName("en.n(B)V")
    public void method2606() {
        if (this.field2034) {
            return;
        }
        synchronized (this) {
            this.field2034 = true;
            this.notifyAll();
        }
        if (this.field2031 != null) {
            while (this.field2031.field2063 == 0) {
                class119.method587(1L);
            }
            if (this.field2031.field2063 == 1) {
                try {
                    ((Thread) this.field2031.field2067).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2031 = null;
    }

    public void finalize() {
        this.method2606();
    }

    @ObfuscatedName("en.t(I)I")
    public int method2589() throws IOException {
        return this.field2034 ? 0 : this.field2029.read();
    }

    @ObfuscatedName("en.l(I)I")
    public int method2587() throws IOException {
        return this.field2034 ? 0 : this.field2029.available();
    }

    @ObfuscatedName("en.m([BIIB)V")
    public void method2590(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2034) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2029.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("en.o([BIII)V")
    public void method2593(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2034) {
            return;
        }
        if (this.field2035) {
            this.field2035 = false;
            throw new IOException();
        }
        if (this.field2028 == null) {
            this.field2028 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2028[this.field2036] = arg0[arg1 + var5];
                this.field2036 = (this.field2036 + 1) % 5000;
                if ((this.field2033 + 4900) % 5000 == this.field2036) {
                    throw new IOException();
                }
            }
            if (this.field2031 == null) {
                this.field2031 = this.field2030.method2501(this, 3);
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
                        if (this.field2036 == this.field2033) {
                            if (this.field2034) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2033;
                        if (this.field2036 >= this.field2033) {
                            var4 = this.field2036 - this.field2033;
                        } else {
                            var4 = 5000 - this.field2033;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2027.write(this.field2028, var3, var4);
                    } catch (IOException var12) {
                        this.field2035 = true;
                    }
                    this.field2033 = (this.field2033 + var4) % 5000;
                    try {
                        if (this.field2036 == this.field2033) {
                            this.field2027.flush();
                        }
                    } catch (IOException var11) {
                        this.field2035 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2029 != null) {
                        this.field2029.close();
                    }
                    if (this.field2027 != null) {
                        this.field2027.close();
                    }
                    if (this.field2032 != null) {
                        this.field2032.close();
                    }
                } catch (IOException var10) {
                }
                this.field2028 = null;
                break;
            }
        } catch (Exception var15) {
            class140.method1379((String) null, var15);
        }
    }
}
