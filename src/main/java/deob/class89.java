package deob;

import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("cy")
public class class89 {

    @ObfuscatedName("cy.u")
    public ExecutorService field1244 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("cy.f")
    public Future field1240 = this.field1244.submit(new class58());

    @ObfuscatedName("cy.u(B)V")
    public void method1949() {
        this.field1244.shutdown();
        this.field1244 = null;
    }

    @ObfuscatedName("cy.f(I)Z")
    public boolean method1945() {
        return this.field1240.isDone();
    }

    @ObfuscatedName("cy.b(B)Ljava/security/SecureRandom;")
    public SecureRandom method1946() {
        try {
            return (SecureRandom) this.field1240.get();
        } catch (Exception var2) {
            return class58.method3994();
        }
    }
}
