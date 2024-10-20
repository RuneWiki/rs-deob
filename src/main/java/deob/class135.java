package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("el")
public final class class135 implements Runnable {

    @ObfuscatedName("el.n")
    public InputStream field2073;

    @ObfuscatedName("el.w")
    public OutputStream field2064;

    @ObfuscatedName("el.i")
    public Socket field2067;

    @ObfuscatedName("el.e")
    public boolean field2066 = false;

    @ObfuscatedName("el.h")
    public class128 field2072;

    @ObfuscatedName("el.q")
    public class138 field2068;

    @ObfuscatedName("el.l")
    public byte[] field2069;

    @ObfuscatedName("el.c")
    public int field2070 = 0;

    @ObfuscatedName("el.f")
    public int field2071 = 0;

    @ObfuscatedName("el.s")
    public boolean field2063 = false;

    public class135(Socket arg0, class128 arg1) throws IOException {
        this.field2072 = arg1;
        this.field2067 = arg0;
        this.field2067.setSoTimeout(30000);
        this.field2067.setTcpNoDelay(true);
        this.field2073 = this.field2067.getInputStream();
        this.field2064 = this.field2067.getOutputStream();
    }

    @ObfuscatedName("el.h(I)V")
    public void method2661() {
        if (this.field2066) {
            return;
        }
        synchronized (this) {
            this.field2066 = true;
            this.notifyAll();
        }
        if (this.field2068 != null) {
            while (this.field2068.field2103 == 0) {
                Statics.method849(1L);
            }
            if (this.field2068.field2103 == 1) {
                try {
                    ((Thread) this.field2068.field2106).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2068 = null;
    }

    public void finalize() {
        this.method2661();
    }

    @ObfuscatedName("el.q(B)I")
    public int method2636() throws IOException {
        return this.field2066 ? 0 : this.field2073.read();
    }

    @ObfuscatedName("el.l(B)I")
    public int method2637() throws IOException {
        return this.field2066 ? 0 : this.field2073.available();
    }

    @ObfuscatedName("el.c([BIIB)V")
    public void method2652(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2066) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2073.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("el.f([BIII)V")
    public void method2648(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2066) {
            return;
        }
        if (this.field2063) {
            this.field2063 = false;
            throw new IOException();
        }
        if (this.field2069 == null) {
            this.field2069 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2069[this.field2071] = arg0[arg1 + var5];
                this.field2071 = (this.field2071 + 1) % 5000;
                if ((this.field2070 + 4900) % 5000 == this.field2071) {
                    throw new IOException();
                }
            }
            if (this.field2068 == null) {
                this.field2068 = this.field2072.method2523(this, 3);
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
                        if (this.field2071 == this.field2070) {
                            if (this.field2066) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2070;
                        if (this.field2071 >= this.field2070) {
                            var4 = this.field2071 - this.field2070;
                        } else {
                            var4 = 5000 - this.field2070;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2064.write(this.field2069, var3, var4);
                    } catch (IOException var12) {
                        this.field2063 = true;
                    }
                    this.field2070 = (this.field2070 + var4) % 5000;
                    try {
                        if (this.field2071 == this.field2070) {
                            this.field2064.flush();
                        }
                    } catch (IOException var11) {
                        this.field2063 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2073 != null) {
                        this.field2073.close();
                    }
                    if (this.field2064 != null) {
                        this.field2064.close();
                    }
                    if (this.field2067 != null) {
                        this.field2067.close();
                    }
                } catch (IOException var10) {
                }
                this.field2069 = null;
                break;
            }
        } catch (Exception var15) {
            class140.method1403((String) null, var15);
        }
    }
}
