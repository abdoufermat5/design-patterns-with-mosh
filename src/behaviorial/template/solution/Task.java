package behaviorial.template.solution;

import behaviorial.template.AuditTrail;

public abstract class Task {
    private AuditTrail auditTrail;
    public Task(){}
    public Task(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }
    
    public void execute(){ 
        auditTrail.record();
        
        doExecute();
    }

    protected abstract void doExecute();
}
