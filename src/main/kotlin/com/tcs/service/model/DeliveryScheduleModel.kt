package com.tcs.service.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

/**
 * This is an example for Model class
 */


@Document(collection = "delivery-schedule-new")
data class DeliveryScheduleModel(
        @Id
        var id: String? = null,
        var deliveryScheduleId: Long?,
        var storeNumber: Long?,
        var deliveryStreamNumber: Int?,
        var deliveryStreamName: String?,
        var schemaName: String?,
        var deliverySchemaType: Int?,
        var startDate: String?,
        var endDate: String?,
        var notes: String?,
        var timeTableList: List<TimeTableModel>?


)