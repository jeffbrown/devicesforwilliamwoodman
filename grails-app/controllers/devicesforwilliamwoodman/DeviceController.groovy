package devicesforwilliamwoodman


import grails.rest.RestfulController

class DeviceController extends RestfulController<Device> {
    static responseFormats = ['json', 'xml']

    DeviceController() {
        super(Device)
    }
}
